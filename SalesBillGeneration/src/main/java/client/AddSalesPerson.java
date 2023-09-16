package client;

import dao.SalesPersonDao;
import entity.SalesPerson;

public class AddSalesPerson {
	public static void addSalesPerson(SalesPersonDao sdao) {
		SalesPerson sai=new SalesPerson(1,"sai");
		sdao.insert(sai);
		
	}

}
