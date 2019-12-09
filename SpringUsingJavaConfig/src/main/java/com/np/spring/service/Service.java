package com.np.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.np.spring.dao.Dao;

@Component
public class Service {
	@Autowired
	private Dao dao;
	
	public void prep() {
		dao.create();
	}
	
	public void init() {
		System.out.println("Before prep");
	}
	
	public void destroy() {
		System.out.println("Before destruction");
	}
}
