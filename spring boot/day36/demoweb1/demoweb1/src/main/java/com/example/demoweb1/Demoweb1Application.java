package com.example.demoweb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demoweb1Application {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(Demoweb1Application.class, args);
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		st.shodata();
	}

}

