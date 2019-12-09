package com.np.spring.beans;

public class Bank {
	private Intrest intrest = null;
	
	
	
	public Intrest getIntrest() {
		return intrest;
	}

	public void setIntrest(Intrest intrest) {
		this.intrest = intrest;
	}



	public void intrestCalculator() {
		System.out.println("Genral Intrest::"+intrest.getRate()+"%");
	}

}
