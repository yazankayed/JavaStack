package com.yazan.burgertrackerone.controllers;

import com.yazan.burgertrackerone.models.Burger;
import com.yazan.burgertrackerone.services.BurgerService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
public class ApiController {


    private final BurgerService burgerService;
    public ApiController(BurgerService burgerService){
        this.burgerService = burgerService;
    }



    @RequestMapping("/api/burgers")
    public List<Burger> index() {
        return burgerService.allBurgers();
    }

    @RequestMapping(value="/api/burgers", method= RequestMethod.POST)
    public Burger create(@RequestParam(value="burgerName") String burgerName,
                         @RequestParam(value="restaurantName") String restaurantName,
                         @RequestParam(value="notes") String notes,
                         @RequestParam(value="rating") Integer rating) {
        Burger burger = new Burger(burgerName, restaurantName, notes, rating);
        return burgerService.createBurger(burger);
    }

    @RequestMapping("/api/burgers/{id}")
    public Burger show(@PathVariable("id") Long id) {
        Burger burger = burgerService.findBurger(id);
        return burger;
    }



}
