package client;

import org.springframework.context.ApplicationContext;

import dao.ProductDao;
import entity.Product;

public class AddProducts {
	
	public static void addProducts(ProductDao pdao) {
		Product shirt=new Product(1,"shirt",700);
		Product pant=new Product(2,"pant",1200);
		Product tie=new Product(3,"Tie",100);
		pdao.insert(shirt);
		pdao.insert(pant);
		pdao.insert(tie);
		
	}

}
