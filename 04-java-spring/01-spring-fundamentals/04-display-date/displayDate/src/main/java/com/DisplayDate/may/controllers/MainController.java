package com.DisplayDate.may.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("date")
	public String date() {
		Date todaysDate = new Date();
		String day = todaysDate.getDay();
		int date = todaysDate.getDate();
		String month = todaysDate.getMonth();
		int year = todaysDate.getYear();
		String today = day + ", the " + date + " of " + month + ", " + year;
	}
	
}
