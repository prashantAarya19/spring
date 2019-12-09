package com.np.spring.beans;

import java.util.Date;

public class WishGenerator {
	private Date date = null;
	private String name = null;
	
	public WishGenerator(Date date, String name) {
		this.date = date;
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void wish() {
		long time = date.getTime();
		if (time <= 12) {
			System.out.println("Good moring " + name);
		} 
		else if (time > 12 && time <= 16) {
			System.out.println("Good afternoon " + name);
		} 
		else if (time > 16 && time <= 21) {
			System.out.println("Good evening " + name);
		} 
		
		else { 
			System.out.println("Good night " + name); 
			}
		 

	}// wish()

}// class
