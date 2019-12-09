package com.np.mvc.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users implements Comparable<Users> {
	// fields
	@Id
	private Integer id = 0;
	private String name = null;
	private String email = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Users user) {
		return this.id.compareTo(user.id);
	}
	

}// class
