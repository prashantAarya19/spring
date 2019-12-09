package com.np.mvc.service;

import java.util.List;

import com.np.mvc.user.entity.Users;

public interface UserService {
	public int save(Users user);
	public List<Users> getAll();
	public Users getUser(Integer id);
}
