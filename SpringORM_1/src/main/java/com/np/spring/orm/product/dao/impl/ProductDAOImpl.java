package com.np.spring.orm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.np.spring.orm.product.dao.ProductDAO;
import com.np.spring.orm.product.entity.Product;

@Repository("dao")
public class ProductDAOImpl implements ProductDAO {
	// fields
	@Autowired
	private HibernateTemplate hibernateTemplate = null;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}// delete

	@Override
	public Product get(int id) {
		Product record = hibernateTemplate.get(Product.class, id);
		return record;
	}
	@Override
	public List<Product> getAll() {
		List<Product> result = hibernateTemplate.loadAll(Product.class);
		return result;
	}
	public void setTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



}
