package com.np.spring.dto;

import org.springframework.stereotype.Component;

@Component("passengerDTO")
public class PassengerDTO {
	// fields
	private int id = 0;
	private String firstName = null;
	private String lastName = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "PassengerDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}// class
