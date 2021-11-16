package com.projeto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(path = {"/home", "/index"})
	public String paginaIndex() {
		return "redirect:/";
	}
	
}
