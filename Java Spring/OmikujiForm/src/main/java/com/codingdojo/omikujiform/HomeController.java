package com.codingdojo.omikujiform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
	
		return "index.jsp";
	}
	// ...

	
	
	// ...
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpSession session,
	    @RequestParam(value="number") String number,
	    @RequestParam(value="city") String city,@RequestParam(value="person") String person,@RequestParam(value="hobby") String hobby,@RequestParam(value="thing") String thing,@RequestParam(value="nice") String nice) {
		
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
	    return "redirect:/show";
	}
	// ...

	
	
	
	
	@RequestMapping("/show")
	public String counterRender(HttpSession session, Model model) {
		
		return "show.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
