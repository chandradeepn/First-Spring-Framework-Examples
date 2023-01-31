package com.springannotations.forbeanthings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PackageTwoConfigurationFirstOne.class)
public class InjectingBeanDependencies {
	@Bean
	public TextEditor edit() {
		return new TextEditor();
	}
}
