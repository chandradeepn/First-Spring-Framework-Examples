package com.springannotations.forbeanthings;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	
	public SpellChecker() {
		System.out.println("This method is in the spellchecker and the method name is spellcheck");
	}
	
	public void spellChecking() {
		System.out.println("This method is in the spellchecker and the method name is spell checking");
	}

}
