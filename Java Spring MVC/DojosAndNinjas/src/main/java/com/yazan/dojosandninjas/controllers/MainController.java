package com.yazan.dojosandninjas.controllers;

import com.yazan.dojosandninjas.models.Dojo;
import com.yazan.dojosandninjas.models.Ninja;
import com.yazan.dojosandninjas.services.DojoService;
import com.yazan.dojosandninjas.services.NinjaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {


    private final DojoService dojoService;
    private final NinjaService ninjaService;
    public MainController(DojoService dojoService, NinjaService ninjaService){
        this.dojoService = dojoService;
        this.ninjaService = ninjaService;
    }






    @GetMapping("/")
    public String home(){
        return "redirect:/dojos/new";
    }


    @GetMapping("/dojos/new")
    public String NewDojo(@ModelAttribute("dojo") Dojo dojo){
        return "index.jsp";
    }

    @PostMapping("/createdojo")
    public String create(Model model, @Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {

        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/ninjas/new";
        }
    }

    @GetMapping("/ninjas/new")
    public String NewNinja(Model model ,@ModelAttribute("ninja") Ninja ninja){

        model.addAttribute("alldojos", dojoService.allDojos());

        return "ninja.jsp";
    }

    @PostMapping("/createninja")
    public String createNinja(Model model , @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        model.addAttribute("alldojos", dojoService.allDojos());
        if (result.hasErrors()) {
            return "ninja.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }




    @GetMapping("/dojos/{id}")
    public String DisplayDojo(Model model,@PathVariable("id") Long id){
        model.addAttribute("specificDojo",dojoService.findDojo(id).getNinjas());
        return "display.jsp";
    }









}
