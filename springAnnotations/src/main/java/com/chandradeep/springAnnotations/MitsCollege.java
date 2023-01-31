package com.chandradeep.springAnnotations;


import org.springframework.stereotype.Component;

@Component

public class MitsCollege implements NAAC {

	public void grade(String gradeName) {
		System.out.println("mits college grade is: "+gradeName);

		
	}

}
