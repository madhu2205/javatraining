package com.example.demosecurity1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@GetMapping("/")
	public String home() {
		String s1="<h1> hello world </h1>";
		String s2="<br><a href=/logout> logout </a>";
		return s1+s2;
	}

}
