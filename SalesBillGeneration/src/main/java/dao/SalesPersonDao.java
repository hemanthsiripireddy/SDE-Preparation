package dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.Customer;
import entity.SalesPerson;

public class SalesPersonDao {
	private HibernateTemplate hTemp;

	public HibernateTemplate gethTemp() {
		return hTemp;
	}

	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}
	@Transactional
	public int insert(SalesPerson s) {
		// TODO Auto-generated method stub
		hTemp.save(s);
		return 0;
	}
	@Transactional
	public SalesPerson getSalesPerson(int id) {
		// TODO Auto-generated method stub
		return hTemp.get(SalesPerson.class, id);
	}


}
