package com.hemanth.spring.jpa.demo.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hemanth.spring.jpa.demo.entity.Product;
import com.hemanth.spring.jpa.demo.service.ProductService;

public class ContextProvider {
	// sprig context is used to instantiate, configure and assemble beans(object) by using xml or annotation or by java code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:/spring.xml");
		ProductService productService=context.getBean(ProductService.class);
		Product p1=new Product(1, "chair");
		productService.save(p1);

	}

}
