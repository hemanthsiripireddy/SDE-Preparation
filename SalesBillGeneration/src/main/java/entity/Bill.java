package entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;


public class Bill {
	
	private int id;
	private Map<Product,Integer> products;
	private Customer customer;
	private SalesPerson salesPerson;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<Product,Integer> getProducts() {
		return products;
	}
	public void addProducts(Product p,int qnty) {
		products.put(p, qnty);
		
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public SalesPerson getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(SalesPerson salesPerson) {
		this.salesPerson = salesPerson;
	}
	public Bill() {
		this.products=new HashMap<Product, Integer>();
		
	}
	public int generateBIll() {
		int bill=0;
		for(Product key:products.keySet()) {
			bill+=(products.get(key)*key.getCost());
			
		}
		return bill;
	}
	
	
	

}
