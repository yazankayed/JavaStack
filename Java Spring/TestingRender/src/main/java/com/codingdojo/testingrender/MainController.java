package com.codingdojo.testingrender;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	        @RequestMapping("/")
	        public String index(Model model) {
	            model.addAttribute("dojoName", "Burbank");
	            return "demo.jsp";
	        } 	

}
	        