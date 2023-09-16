package client;

import dao.CustomerDao;
import entity.Customer;

public class AddCustomer {
	public static void addCustomer(CustomerDao cdao) {
		Customer suresh=new Customer(2,"suresh","chennai");
		cdao.insert(suresh);
	}

}
