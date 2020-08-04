package com.DisplayDate.may.controllers;

import java.time.LocalDate; 
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	// Home Page 
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	// Date Page 
	@RequestMapping("date")
	public String date(Model model) {
		LocalDate today = LocalDate.now(); // creating an instance of LocatDate class
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, 'the' d 'of' MMMM, y"); // creating a format pattern
		String todayString = today.format(formatter); // formatting the object
		model.addAttribute("todaysDate", todayString); 

		return "date.jsp"; 
	}
	
	// Time Page
	@RequestMapping("time")
	public String time(Model model) {
		ZonedDateTime now = ZonedDateTime.now(); // creating an instance of ZonedDateTime class
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a"); // creating a format pattern
		String nowString = now.format(formatter); // formatting the object
		model.addAttribute("todaysTime", nowString);

		return "time.jsp";
	}
	
}
