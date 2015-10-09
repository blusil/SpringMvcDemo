package org.maverick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public @ResponseBody String findAll(ModelMap model) {
		String jsonData = "[{\"id\":\"1\",\"title\":\"Die Hard\",\"genre\":\"Action\",\"rating\":\"4.5\",\"imageUrl\":\"http://localhost:8080/SpringMvcDemo/resources/img/Die-Hard.jpg\"},"
				+ "{\"id\":\"2\",\"title\":\"Man of Steel\",\"genre\":\"Action\",\"rating\":\"5\",\"imageUrl\":\"http://localhost:8080/SpringMvcDemo/resources/img/Man-Of-Steel.jpg\"}]";
		
		return jsonData;
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String Index(Model model) {
		model.addAttribute("greeting", "Welcome");
		
		return "main";
	}
}
