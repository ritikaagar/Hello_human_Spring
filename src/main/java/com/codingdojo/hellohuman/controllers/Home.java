package com.codingdojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value = "name", required = false, defaultValue= "User") String userInput) {
		String out = "Hello " + userInput;
		model.addAttribute("out", out);
		return "index.jsp";
	}
}
