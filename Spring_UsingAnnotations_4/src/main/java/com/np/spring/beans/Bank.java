package com.np.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Bank {
	private Intrest intrest = null;
	
	
	
	public Intrest getIntrest() {
		return intrest;
	}
	//@Required
	@Autowired
	@Qualifier("myIntr")
	public void setIntrest(Intrest intrest) {
		this.intrest = intrest;
	}



	public void intrestCalculator() {
		System.out.println("Genral Intrest::"+intrest.getRate()+"%");
	}

}
