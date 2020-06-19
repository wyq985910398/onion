package com.web.wyq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

public interface HelloInterface {

	@RequestMapping("sayHello2")
	@ResponseBody
	ModelAndView sayHello(int age, String name);
}
