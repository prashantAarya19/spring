package com.np.mvc.dao;

import java.util.List;

import com.np.mvc.user.entity.Users;

public interface UserDao {
	
	public int create(Users user);
	public List<Users> loadAll();
	public Users findUser(int id);
}
