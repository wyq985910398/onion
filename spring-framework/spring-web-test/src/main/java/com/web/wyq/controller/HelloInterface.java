package com.web.wyq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *HelloInterface
 * @author A
 */
interface HelloInterface {

	/**
	 * sayHello
	 * @param age
	 * @param name
	 * @return
	 */
	@RequestMapping("sayHello")
	ModelAndView sayHelloFunc(int age, String name);
}
