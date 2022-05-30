package com.example.demorestdata1;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface StudentRepository extends JpaRepositoryImplementation<Student,Integer> {

}
