package com.codingdojo.testingrender;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		
		   

		   ArrayList<Item> fruits = new ArrayList<Item>();
	      
	        fruits.add(new Item("Mango", 2.0));
	        fruits.add(new Item("Goji Berries", 4.0));
	        fruits.add(new Item("Guava", .75));
	        model.addAttribute("fruits", fruits);
//	        System.out.print("*******************************");
//	        System.out.print(fruits.get(0).);
	        
//	        System.out.print("__________________________");
	        
		return "index.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
