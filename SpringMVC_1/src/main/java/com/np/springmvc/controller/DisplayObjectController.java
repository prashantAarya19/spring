package com.np.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.np.springmvc.dto.EmployeeDTO;

@Controller
public class DisplayObjectController {
	
	@RequestMapping("/employeeDetails")
	public ModelAndView displayObject() {
		ModelAndView modelAndView = new ModelAndView();
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(101);
		dto.setName("Prashant");
		dto.setSalary(10000);
		modelAndView.addObject("Employee",dto);
		return modelAndView;
	}//displayObject()

}//class
