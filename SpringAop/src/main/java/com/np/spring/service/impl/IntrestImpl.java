package com.np.spring.service.impl;

import com.np.spring.service.Intrest;

public class IntrestImpl implements Intrest {

	@Override
	public double getIntrest(double amount) {
		return (amount*7)/100;
	}//getIntrest()

}//class
