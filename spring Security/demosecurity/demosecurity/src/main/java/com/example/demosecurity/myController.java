package com.example.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	@GetMapping("/")
	public String home() {
		String s1="<h1> hello World <h1>";
		String s2="<br> <a href=/logout> logout </a>";
		return s1+s2;
		
	}

}
