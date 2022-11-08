package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	
//	@RequestMapping({"/hello","/index"})
	@GetMapping(value = "/hello")
	public String hellorWorld(Model model) {
		model.addAttribute("nombre", "Chesita");
		return "index";
	}
}