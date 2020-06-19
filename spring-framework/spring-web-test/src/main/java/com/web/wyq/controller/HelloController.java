package com.web.wyq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.annotation.Inherited;

/**
 * @author Administrator
 */
@Controller
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HelloController  implements HelloInterface{

	@Autowired
	TestAop testAop;

	@Override
	public ModelAndView sayHelloFunc(int age, String name) {
		ModelAndView mav = new ModelAndView();
		MyBean bean = new MyBean(age, name);
		mav.addObject("myBean", bean);
		mav.setViewName("sayHello");
		System.out.println(bean.toString());
		testAop.sayHello();
		return mav;
	}
}
