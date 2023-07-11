package com.codingdojo.daikichipathvariables;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class daikichipathvariables {
	@GetMapping("")
	public String welcome() {
		return "Welcome!";
	}
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@GetMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to " + city + "!" ;
	}
	@GetMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		if (num%2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";	
		}
	}
}
