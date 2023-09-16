package dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.Bill;
import entity.Customer;

public class BillDao {
	private HibernateTemplate hTemp;

	public HibernateTemplate gethTemp() {
		return hTemp;
	}

	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}
	@Transactional
	public int insert(Bill s) {
		// TODO Auto-generated method stub
		hTemp.save(s);
		return 0;
	}
	@Transactional
	public Bill getBill(int id) {
		// TODO Auto-generated method stub
		return hTemp.get(Bill.class, id);
	}


}
