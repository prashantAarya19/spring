package com.np.spring.dto;

import org.springframework.stereotype.Component;

@Component("dto")
public class EmployeeDTO {
	// fields
	private int id = 0;
	private String firstname = null;
	private String lastname = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}// class
