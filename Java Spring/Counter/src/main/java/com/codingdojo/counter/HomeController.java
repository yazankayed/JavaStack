package com.codingdojo.counter;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount ++;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	// ...

	
	@RequestMapping("/counter")
	public String counterRender(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "counter.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
