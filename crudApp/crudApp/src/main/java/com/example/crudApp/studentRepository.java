package com.example.crudApp;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;


public interface studentRepository extends JpaRepositoryImplementation<Student,Integer> {

}

