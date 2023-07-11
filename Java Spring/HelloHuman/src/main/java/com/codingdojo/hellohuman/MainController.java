package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    
    
    @GetMapping("/")
	public String hello(@RequestParam(value="name", required=false) String searchQuery, @RequestParam(value="lastname", required=false) String searchQueryLast, @RequestParam(value="times", required=false) Integer times) {
		if(searchQuery == null || searchQueryLast == null || times == null) {
			return "Hello Unknown! multiple times hahaha";
		}
		else {
			return ("Hello " + searchQuery +" "+ searchQueryLast + "! ").repeat(times);
		}
	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
