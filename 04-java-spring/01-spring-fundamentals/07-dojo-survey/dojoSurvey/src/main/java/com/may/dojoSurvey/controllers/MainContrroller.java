package com.may.dojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.may.dojoSurvey.models.Survey;

@Controller
public class MainContrroller {
	
	private String[] getLanguages() {
		return new String[] {
			"C#", "Java", "Python", "C++"
		};
	}
	
	private String[] getLocations() {
		return new String[] {
			"Seattle", "Dallas", "San Jose", "Chicago", "Tulsa"
		};
	}
	
	private boolean javaFanClub(Object obj) {
		System.out.println(obj);
		if(obj.equals("Java")) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
	
	@RequestMapping("/")
	public String Index(Model model) {
		model.addAttribute("locations", getLocations());
		model.addAttribute("languages", getLanguages());
		return "index.jsp";
	}
	
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String Results(@RequestParam(value="name") String name, 
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment,
			Model model){
		model.addAttribute("result", new Survey(name, location, language, comment));
		if (javaFanClub(language)) {
			System.out.println(javaFanClub(language));
			return "javaLovers.jsp";
		} else {
		return "result.jsp";
		}
	}
	
}
