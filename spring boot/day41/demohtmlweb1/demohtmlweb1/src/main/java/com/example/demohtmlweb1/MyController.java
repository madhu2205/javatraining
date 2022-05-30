package com.example.demohtmlweb1;

import java.lang.String;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
 
	@GetMapping("/main")
	public String goToMain(@RequestParam String uname,HttpSession session) {
		//model.addAttribute("fname", uname);
		session.setAttribute("fname", uname);
		return "main";
	}
	@GetMapping("/movie")
	public String goToMovie(HttpSession session) {
		String n = (String) session.getAttribute("fname");
		System.out.println("Name of USer " + n);
		return "movie";
	}

	@GetMapping("/sports")
	public String goToSport(HttpSession session) {
		
		String n = (String) session.getAttribute("fname");
		System.out.println("Name of USer " + n);
		return "sports";
	}

}
