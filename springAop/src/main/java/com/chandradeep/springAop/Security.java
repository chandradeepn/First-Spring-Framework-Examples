package com.chandradeep.springAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Security {

	@Before("execution(public void show())")
	public void securityName() {
		System.out.println("The security for my application is:ficked");
	}

}
