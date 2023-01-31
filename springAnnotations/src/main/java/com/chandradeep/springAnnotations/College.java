package com.chandradeep.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Autowired
	@Qualifier("mitsCollege")
	NAAC fit;
	

	public NAAC getFit() {
		return fit;
	}


	public void setFit(NAAC fit) {
		this.fit = fit;
	}


	void details() {
		System.out.println("my name is chandradeep and i am studied in svec college");
		fit.grade("A");
	}

}
