package com.hemanth.spring.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hemanth.spring.jpa.demo.entity.Product;
@Component
public class ProductDaoImpl implements ProductDao {
	//
	@PersistenceContext
	private EntityManager entityManagerFactory;

	public void save(Product product) {
		// TODO Auto-generated method stub
		entityManagerFactory.persist(product);
		
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return entityManagerFactory.createQuery("Select p from Product p").getResultList();
	}

}
