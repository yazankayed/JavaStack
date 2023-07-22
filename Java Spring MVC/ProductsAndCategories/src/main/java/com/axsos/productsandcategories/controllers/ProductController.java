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
public class ProductController {
    private final ProductService productService;
    private final CategoryService categoryService;
    private final UserService userService;

    public ProductController(ProductService productService, CategoryService categoryService, UserService userService) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.userService = userService;
    }

    @GetMapping("/products/new")
    public String productForm(@ModelAttribute("product")Product product, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            return "addProduct.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/addProduct")
    public String addProduct(@Valid @ModelAttribute("product")Product product, Model model, HttpSession session, BindingResult result){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            if(result.hasErrors()){
                return "addProduct.jsp";
            }else {
                productService.createProduct(product);
                return "redirect:/home";
            }
        }
        return "redirect:/";
    }

    @GetMapping("/products/{id}")
    public String productInfo(@PathVariable("id") Long id, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Product product = productService.findProduct(id);
            model.addAttribute("product", product);
            model.addAttribute("assignedCategories", categoryService.getAssignedCategory(product));
            model.addAttribute("unassignedCategories", categoryService.getUnassignedCategory(product));


            return "productInfo.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/addCategoryToProduct/{id}")
    public String addCategoryToProduct(@PathVariable("id") Long productId, @RequestParam(value = "categoryId") Long categoryId, Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Product product = productService.findProduct(productId);
            Category category = categoryService.findCategory(categoryId);
            product.getCategories().add(category);
            productService.updateProduct(product);

            return "redirect:/products/{id}";
        }
        return "redirect:/";
    }

}
