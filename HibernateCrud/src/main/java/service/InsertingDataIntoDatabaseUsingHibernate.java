package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class InsertingDataIntoDatabaseUsingHibernate {
	public static void insert() {
		System.out.println("Connecting to database");
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
		Teacher ramesh=new Teacher("Ramesh","S","ramesh@gmai.com");
		Teacher suresh=new Teacher("Sureah","Dharma","ramesh@gmai.com");
		Teacher harish=new Teacher("Harish","K","ramesh@gmai.com");
		Session session=null;
		Transaction tx=null;
		try {
		
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			session.save(ramesh);
			session.save(suresh);
			session.save(harish);
			
			tx.commit();
			
		}
		catch(Exception e) {
			System.out.println("error");
			tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	}


