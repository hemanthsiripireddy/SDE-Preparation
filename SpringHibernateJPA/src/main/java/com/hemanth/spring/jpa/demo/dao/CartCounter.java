package com.hemanth.spring.jpa.demo.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("application")
public class CartCounter{
	private int totalCarts=0;
	public int getTotalCarts() {
		return totalCarts;
	}
	public void incrementCartCount() {
		totalCarts++;
	}
	public void decrementCartCount() {
		totalCarts--;
	}
}
