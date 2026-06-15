package com.itccloud.mwccdc.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
		
		String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		model.addAttribute("time", time);
		
		return "index-form";
		

	}

}
