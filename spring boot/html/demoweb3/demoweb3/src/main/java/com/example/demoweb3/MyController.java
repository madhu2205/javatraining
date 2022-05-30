package com.example.demoweb3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/sayhello")
		public String greetings(@RequestParam(name="uname",required=false,defaultValue="DIEMS")String name,Model model,@RequestParam(name="passss",required=false,defaultValue="wrong Pass")String pass,Model mode2) {
		model.addAttribute("uname",name);
		mode2.addAttribute("password",pass);
			return "hello";
			
		}
	}


