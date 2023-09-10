package service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Appconfig;
import entity.ShoppingCart;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		ShoppingCart cart=context.getBean(ShoppingCart.class);
		cart.setName("book");
		System.out.println(cart.getName());
		

	}

}
