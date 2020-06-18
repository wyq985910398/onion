package com.web.wyq.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAop {

	@Before("com.web.wyq.aop.UserAspect.addLog()")
	public void before(){
		System.out.println("before AOP notice ");
	}


}
