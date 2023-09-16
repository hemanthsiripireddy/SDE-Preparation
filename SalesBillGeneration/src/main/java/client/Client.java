package client;

import org.hibernate.mapping.Map;
import org.springframework.context.ApplicationContext;
import java.util.*;

import context.ContextProvider;
import dao.BillDao;
import dao.CustomerDao;
import dao.ProductDao;
import dao.SalesPersonDao;
import entity.Bill;
import entity.Customer;
import entity.Product;


public class Client {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= ContextProvider.provideContext();
		
		CustomerDao customerDao= ctx.getBean("cDao",CustomerDao.class);
		ProductDao productDao= ctx.getBean("pDao",ProductDao.class);
		SalesPersonDao salesPerson= ctx.getBean("sDao",SalesPersonDao.class);
//		BillDao bdao=ctx.getBean("bDao",BillDao.class);
//		AddCustomer.addCustomer(customerDao);
//		AddSalesPerson.addSalesPerson(salesPerson);
//		AddProducts.addProducts(productDao);
		Bill bill=billGeneration(customerDao, salesPerson, productDao);
		displayBillDetails(bill);
		
		
		
		
//		Customer hemanth=new Customer(1,"hemanth","tirupati");
//		customerDao.insert(hemanth);
		

	}
	public static Bill billGeneration(CustomerDao cdao,SalesPersonDao sdao,ProductDao pdao) {
		 Bill bill =new Bill();
		 bill.setCustomer(cdao.getCustomer(1));
		 bill.setSalesPerson(sdao.getSalesPerson(1));
		 bill.addProducts(pdao.getProduct(1), 15);
		 bill.addProducts(pdao.getProduct(2), 12);
		
		return bill;
		
		 
		
		
	}
	public static void displayBillDetails(Bill bill) {
		System.out.println("BIll id: "+bill.getId());
		System.out.println("Customer name: "+bill.getCustomer().getName());
		System.out.println("SalesPerson name: "+bill.getSalesPerson().getName());
		
		System.out.println("total price of the bill "+ bill.generateBIll());
		
	}
	

}
