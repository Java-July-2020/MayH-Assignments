package com.may.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
		
		// Check if the password is correct
		private Boolean isCorrectCode(String guess) {
			return guess.equals("bushido");
		}
		
		// Get Tenets 
		private String[] getTenets() {
			return new String[] {
				"Loyalty", "Courage", "Veracity", "Compassion", "Honor"
			};
		}
		
		// Landing Page
		@RequestMapping("/")
		public String Index() {
			return "index.jsp";
		}
		
		// Page after password has been attempted
		@RequestMapping(value="/attempt", method=RequestMethod.POST)
		public String Attempt(@RequestParam(value="guess") String guess, Model model, RedirectAttributes rAttributes) {
			if(isCorrectCode(guess)) {
				// Give access to code route if password is correct
				return "redirect:/code";
			}
			rAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";		
		}
		
		@RequestMapping("/code")
		public String Code(Model model) {
			model.addAttribute("tenets", getTenets());
			return "code.jsp";	
	}
}
