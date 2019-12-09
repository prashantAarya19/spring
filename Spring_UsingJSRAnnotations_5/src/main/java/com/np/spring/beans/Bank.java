//Using JSRs-250(Java Specification Requests ) annotation
package com.np.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Bank {
	private Intrest intrest = null;
	
	
	
	public Intrest getIntrest() {
		return intrest;
	}
	
	@Resource(name = "intrest2")
	public void setIntrest(Intrest intrest) {
		this.intrest = intrest;
	}



	public void intrestCalculator() {
		System.out.println("Genral Intrest::"+intrest.getRate()+"%");
	}
	
	@PostConstruct
	public void bankInit() {
		System.out.println("Bank bean has been initilize");
	}
	
	@PreDestroy
	public void bankDestroy() {
		System.out.println("Bank bean destroyed");
	}

}
