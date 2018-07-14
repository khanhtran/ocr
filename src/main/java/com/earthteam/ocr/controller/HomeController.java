package com.earthteam.ocr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.earthteam.ocr.service.EmployeeService;
  
@Controller
public class HomeController {

	
  	@Autowired
 	private EmployeeService customerService;

	@RequestMapping({"/","/welcome"})
	public String welcome(Model model) {
		
		
		model.addAttribute("greeting", "Welcome to the Lone Ranger Company, Kimosabe!!");
		model.addAttribute("tagline", "The one and only place to work, so you can live and play!!");

/*
 		Customer c = new Customer();

		c.setLastName("Dreamer");
		c.setFirstName("Freddy");
 		c.setAge(15);
*/		
 		
//		customerService.save(c);
		
		return "welcome";
	}
	
	@RequestMapping("/welcome/greeting")
	public String greeting() {
		return "welcome";
	}
}
