package com.np.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.np.springmvc.dto.EmployeeDTO;

@Controller
public class DisplayListController {
	
	@RequestMapping("/employeeList")
	public ModelAndView displayObject() {
		ModelAndView modelAndView = new ModelAndView();
		
		EmployeeDTO employee1 = new EmployeeDTO();
		EmployeeDTO employee2 = new EmployeeDTO();
		EmployeeDTO employee3 = new EmployeeDTO();
		
		employee1.setId(101);
		employee1.setName("Prashant");
		employee1.setSalary(20000);
		
		employee2.setId(102);
		employee2.setName("Namrata");
		employee2.setSalary(15000);
		
		employee3.setId(103);
		employee3.setName("Meeli");
		employee3.setSalary(18000);
		
		List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		modelAndView.addObject("employees",employees);
		return modelAndView;
	}//displayObject()

}//class
