package dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.Customer;
import entity.Product;

public class CustomerDao {
	private HibernateTemplate hTemp;

	public HibernateTemplate gethTemp() {
		return hTemp;
	}

	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}
	@Transactional
	public int insert(Customer s) {
		// TODO Auto-generated method stub
		hTemp.save(s);
		return 0;
	}
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return hTemp.get(Customer.class, id);
	}


}
