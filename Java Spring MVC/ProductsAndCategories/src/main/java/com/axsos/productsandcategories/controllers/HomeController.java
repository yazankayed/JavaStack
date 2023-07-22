package com.axsos.productsandcategories.controllers;

import com.axsos.productsandcategories.models.Category;
import com.axsos.productsandcategories.models.Product;
import com.axsos.productsandcategories.models.User;
import com.axsos.productsandcategories.models.LoginUser;
import com.axsos.productsandcategories.services.CategoryService;
import com.axsos.productsandcategories.services.ProductService;
import com.axsos.productsandcategories.services.UserService;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final UserService userService;
    private final ProductService productService;
    private final CategoryService categoryService;

    public HomeController(UserService userServ, ProductService productService, CategoryService categoryService) {
        this.userService = userServ;
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String index(Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            return "redirect:/home";
        }
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "login.jsp";
    }


    @GetMapping("/home")
    public String books(Model model, HttpSession session){
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userService.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            List<Product> products = productService.allProducts();
            model.addAttribute("products", products);
            List<Category> categories = categoryService.allCategory();
            model.addAttribute("categories", categories);

            return "home.jsp";
        }
        return "redirect:/";
    }

}
