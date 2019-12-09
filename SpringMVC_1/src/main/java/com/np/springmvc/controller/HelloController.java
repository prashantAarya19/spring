package com.np.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", 101);
		modelAndView.addObject("name", "Prashant");
		modelAndView.addObject("salary", 10000);
		
		modelAndView.setViewName("hello");
		return modelAndView;
	}//hello()
}//class
