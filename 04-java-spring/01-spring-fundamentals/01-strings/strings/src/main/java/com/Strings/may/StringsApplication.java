package com.Strings.may;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class StringsApplication {
	// Entry Point Method
	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String landing() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "SpringBoot is great! So easy to just respond with strings.";
	}

}
