package com.np.spring.orm.product.dao;

import java.util.List;

import com.np.spring.orm.product.entity.Product;

public interface ProductDAO {
	public int create(Product product);
	public void update(Product product);
	public void delete(Product product);
	public Product get(int id);
	public List<Product> getAll();
}//interface
