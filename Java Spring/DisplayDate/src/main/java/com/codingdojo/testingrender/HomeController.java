package com.codingdojo.testingrender;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat newDate = new SimpleDateFormat("EEEE, 'the 'dd' of' MMMM , yyyy");
		String forDate = newDate.format(date);
		model.addAttribute("date", forDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		SimpleDateFormat newDate = new SimpleDateFormat("hh:mm a");
		String forTime = newDate.format(time);
		model.addAttribute("time", forTime);
		return "time.jsp";
	}
	
}