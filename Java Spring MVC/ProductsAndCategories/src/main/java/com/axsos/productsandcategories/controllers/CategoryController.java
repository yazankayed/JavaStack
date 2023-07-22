package com.axsos.productsandcategories.controllers;


import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.models.User;
import com.axsos.productsandcategories.services.CategoryService;
import com.axsos.productsandcategories.services.ProductService;
import com.axsos.productsandcategories.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class CategoryController {
    private final CategoryService categoryService;
    private final ProductService productService;
    private final UserService userService;

    public CategoryController(CategoryService categoryService, ProductService productService, UserService userService) {
        this.categoryService = categoryService;
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping("/categories/new")
    public String categoryForm(@ModelAttribute("category") Category category, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            return "addCategory.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/addCategory")
    public String addCategory(@Valid @ModelAttribute("category") Category category, Model model, HttpSession session, BindingResult result){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            if(result.hasErrors()){
                return "addCategory.jsp";
            }else {
                categoryService.createCategory(category);
                return "redirect:/home";
            }
        }
        return "redirect:/";
    }

    @GetMapping("/categories/{id}")
    public String categoryInfo(@PathVariable("id") Long id, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Category category = categoryService.findCategory(id);
            model.addAttribute("category", category);
            model.addAttribute("assignedProducts", productService.getAssignedProducts(category));
            model.addAttribute("unassignedProducts", productService.getUnassignedProducts(category));

            return "categoryInfo.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/addProductToCategory/{id}")
    public String addProductToCategory(@PathVariable("id") Long categoryId, @RequestParam(value = "productId") Long productId, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Category category = categoryService.findCategory(categoryId);
            Product product = productService.findProduct(productId);
            category.getProducts().add(product);
            categoryService.updateCategory(category);

            return "redirect:/categories/{id}";
        }
        return "redirect:/";
    }

}
