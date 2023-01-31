package com.springannotations.forbeanthings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PackageTwoConfigurationFirstOne {

	@Bean
	public SpellChecker spell() {
		return new SpellChecker();
	}
	

}
