package com.example.demoweb1;

import org.springframework.beans.factory.annotation.Autowired;



public class StudentDetails {
	
	@Autowired
	private Student stud;
	
	
	void setdata() {
		stud.setId(100);
		stud.setName("abc");
	}
	void shodata() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}

}
