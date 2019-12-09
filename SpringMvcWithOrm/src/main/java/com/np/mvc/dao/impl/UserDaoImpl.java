package com.np.mvc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.np.mvc.dao.UserDao;
import com.np.mvc.user.entity.Users;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	HibernateTemplate template = null;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public int create(Users user) {
		Integer result = (Integer) template.save(user);
		return result;
	}

	@Override
	public List<Users> loadAll() {
		List<Users> allData = template.loadAll(Users.class);
		return allData;
	}

	@Override
	public Users findUser(int id) {
		return template.get(Users.class, id);
	}

}
