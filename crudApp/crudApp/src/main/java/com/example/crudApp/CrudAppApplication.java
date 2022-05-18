package com.example.crudApp;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(CrudAppApplication.class,args);
		studentRepository stud;
		stud=context.getBean(studentRepository.class);
		
		//insert
		Student st1=new Student(300,"cccc");
		stud.save(st1);
		System.out.println("Record Saved");
		
		
		//update
		
		Optional<Student>op;
		
		op=stud.findById(300);
		Student st2=op.get();
	    System.out.println(st2.getId());
		System.out.println(st2.getName());
	    st2.setName("Demo123");
	    stud.save(st2);
		
		
		//delete
		
		
		
		
		
	}

}
