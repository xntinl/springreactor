package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class BasisController {
	@Autowired
	AccountTemplateOperations service;

	@GetMapping
	public String get(Model model) {
		model.addAttribute("list", service.findAll());
		return "index";
	}

}
