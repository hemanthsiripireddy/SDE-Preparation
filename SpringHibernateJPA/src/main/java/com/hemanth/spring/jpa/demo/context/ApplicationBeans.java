package com.hemanth.spring.jpa.demo.context;

import com.hemanth.spring.jpa.demo.dao.ShoppingCart;

public class ApplicationBeans {
	
	public ShoppingCart shoppintCart() {
		return new ShoppingCart();
	}

}
