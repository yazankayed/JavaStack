package com.yazan.burgertrackerone.controllers;

import com.yazan.burgertrackerone.models.Burger;
import com.yazan.burgertrackerone.services.BurgerService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/burgers/edit/{id}")
    public String edit(@PathVariable("id" ) Long id , Model model , @ModelAttribute("burger") Burger burger){
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhh");
        Burger specificBurger = burgerService.findBurger(id);
        model.addAttribute("specificBurger", specificBurger);
        return "edit.jsp";
    }

    @PostMapping("/updateBurger/{id}")
    public String update(@PathVariable("id" ) Long id ,Model model, @Valid @ModelAttribute("burger") Burger burger, BindingResult result) {

        Burger specificBurger = burgerService.findBurger(id);
        model.addAttribute("specificBurger", specificBurger);
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            burgerService.updateBurger(burger);
            return "redirect:/";
        }
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
