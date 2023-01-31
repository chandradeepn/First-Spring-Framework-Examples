package com.chandradeep.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SvecCollege implements NAAC {

	public void grade(String gradeName) {
		
		System.out.println("For svec college the naac grade is: "+gradeName);
	}

}
