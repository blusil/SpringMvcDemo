package org.maverick.controller;

import org.maverick.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public @ResponseBody String findAll(ModelMap model) {
		return movieService.findAll();
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String Index(Model model) {
		model.addAttribute("greeting", "Welcome");
		
		return "main";
	}
}
