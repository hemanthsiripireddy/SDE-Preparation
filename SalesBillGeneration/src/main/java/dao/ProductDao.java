package dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.Product;


public class ProductDao {
	private HibernateTemplate hTemp;

	public HibernateTemplate gethTemp() {
		return hTemp;
	}

	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}
	@Transactional
	public int insert(Product s) {
		// TODO Auto-generated method stub
		hTemp.save(s);
		return 0;
	}
	@Transactional
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return hTemp.get(Product.class, id);
	}


}
