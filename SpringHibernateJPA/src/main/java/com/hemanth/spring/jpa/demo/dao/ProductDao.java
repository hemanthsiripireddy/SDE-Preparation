package com.hemanth.spring.jpa.demo.dao;

import java.util.List;

import com.hemanth.spring.jpa.demo.entity.Product;

public interface ProductDao {
	
	public void save(Product product);
	public List<Product> findAll();

}
