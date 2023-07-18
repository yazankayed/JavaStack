package com.yazan.burgertrackerone.controllers;

import com.yazan.burgertrackerone.models.Burger;
import com.yazan.burgertrackerone.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
public class HomeController {
    private final BurgerService burgerService;
    public HomeController(BurgerService burgerService){
        this.burgerService = burgerService;
    }

    @RequestMapping("/")
    public String home(Model model ,@ModelAttribute("burger") Burger burger){



        List<Burger> allBurgers = burgerService.allBurgers();
        model.addAttribute("allburgers", allBurgers);
        return "index.jsp";
    }

    @PostMapping("/createburger")
    public String create(Model model, @Valid @ModelAttribute("burger") Burger burger, BindingResult result) {

        List<Burger> allBurgers = burgerService.allBurgers();
        model.addAttribute("allburgers", allBurgers);
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            burgerService.createBurger(burger);
            return "redirect:/";
        }
    }



}
