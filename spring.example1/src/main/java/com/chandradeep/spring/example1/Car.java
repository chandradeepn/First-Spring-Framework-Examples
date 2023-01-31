package com.chandradeep.spring.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	private Student stud;

	
	public Student getStud() {
		return stud;
	}


	public void setStud(Student stud) {
		this.stud = stud;
	}


	public void ride() {
		System.out.println(stud+" is car");
	}
}
