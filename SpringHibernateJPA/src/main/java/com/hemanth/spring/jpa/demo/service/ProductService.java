package com.hemanth.spring.jpa.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hemanth.spring.jpa.demo.dao.ProductDao;
import com.hemanth.spring.jpa.demo.entity.Product;
@Component
public class ProductService {
	@Autowired
	ProductDao productDao;
	@Transactional
	public void save(Product product) {
		productDao.save(product);
		
	}

}
