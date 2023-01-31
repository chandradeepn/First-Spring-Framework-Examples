package com.springannotations.forbeanthings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	
	@Autowired
	SpellChecker spellCheck;
	
	

	public void show() {
		spellCheck.spellChecking();
	}
}
