package com.np.mvc.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.np.mvc.dao.UserDao;
import com.np.mvc.service.UserService;
import com.np.mvc.user.entity.Users;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao = null;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public int save(Users user) {
		int result = userDao.create(user);
		return result;
	}

	@Override
	public List<Users> getAll() {
		List<Users> records = userDao.loadAll(); 
		Collections.sort(records);
		return records;
	}

	@Override
	public Users getUser(Integer id) {
		// TODO Auto-generated method stub
		return userDao.findUser(id);
	}

}
