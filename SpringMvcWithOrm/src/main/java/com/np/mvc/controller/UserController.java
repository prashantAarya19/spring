package com.np.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.np.mvc.service.UserService;
import com.np.mvc.user.entity.Users;

@Controller
public class UserController {
	@Autowired
	UserService service = null;

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@RequestMapping("regPage")
	public String showRegistrationPage() {
		return "regPage";
	}
	
	@RequestMapping(value = "resultPage", method = RequestMethod.POST)
	public String resultPage(@ModelAttribute("user") Users user, ModelMap model) {
		int result = service.save(user);
		model.addAttribute("result", "User Created with id "+result);
		return "resultPage";
	}
	@RequestMapping(value = "getAll")
	public String retriveData(ModelMap model) {
		List<Users> records = service.getAll();
		model.addAttribute("records", records);
		return "recordsTable";
	}
	
	@RequestMapping("validateUser")
	public @ResponseBody String validateUser(@RequestParam("id") int id) {
		System.out.println("validate user method id::"+id);
		Users user = service.getUser(id);
		String message = "";
		if(user!=null) {
			return id + " already exist";
		}
		return message;
		
	}
}
