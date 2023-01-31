package com.chandradeep.spring.example1;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void ride() {
		System.out.println("bike is riding");
	}
	
}
