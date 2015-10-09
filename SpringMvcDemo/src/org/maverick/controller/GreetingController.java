package org.maverick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	
	@RequestMapping(value ="/greeting")
	public String sayHello (Model model) {
		
		model.addAttribute("greeting", "We come in peace");
		
		return "hello";
	}
}
