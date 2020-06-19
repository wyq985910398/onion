package com.web.wyq.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

	/**
	 * 匹配所有controller包下面的所有类的所有方法
	 */
	@Pointcut("execution(* com.web.wyq.controller.*.*(..))")
	public void addLog(){}

}
