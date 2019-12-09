package com.np.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.np.springmvc.dto.User;

@Controller
public class FormController {
		
	/*
	 * @RequestMapping("regUser") public ModelAndView showRegistrationPage() {
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.setViewName("registerUser"); return modelAndView; }
	 */
		
		@RequestMapping("regUser")
		public String showRegistrationPage() {
			return "registerUser";
		}
		
	/*
	 * @RequestMapping(value = "registerUser", method = RequestMethod.POST) public
	 * ModelAndView registerUser(@ModelAttribute("user") User user) {
	 * System.out.println(user); ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.addObject("user", user);
	 * modelAndView.setViewName("showDetails"); return modelAndView; }
	 */
		
		@RequestMapping(value = "registerUser", method = RequestMethod.POST)
		public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap)  {
			System.out.println(user);
			modelMap.addAttribute("user", user);
			return "showDetails";
		}
		
}
