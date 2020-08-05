package com.may.Counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
    public String index(HttpSession session){
        // check if a key exists in session with the name "count"
        if(session.getAttribute("count") == null) {
            // no key found!  set session "count" to 0
            session.setAttribute("count", 0);
        } else {
            // first retrieve the current value in session, casting from Object to Integer
            Integer currentCount = (Integer) session.getAttribute("count");
            // increment count by 1
            currentCount++;
            // set the updated count value back into session
            session.setAttribute("count", currentCount);
        }
        return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String Counter(HttpSession session, Model model) {
		model.addAttribute("count", session.getAttribute("count"));
		return "counter.jsp";
	}
	
}
