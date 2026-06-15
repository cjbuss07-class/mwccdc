package com.itccloud.mwccdc.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		
		String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(time);
		
		return "index-form";
		

	}

}
