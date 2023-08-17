package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class UpdatingObjects {
	// hibernate query language 
	public static void updateUsingSetters() {
		// this is for single object
System.out.println("Connecting to database");
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
		
		Session session=null;
		Transaction tx=null;
		
		try {
		
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			Teacher t=session.get(Teacher.class, 1);
			t.setL_name("Siripireddy");
			session.update(t);
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
	public static  void updateUsingCreateQuery() {
		// this is for multiple objects 
System.out.println("Connecting to database");
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
		
		Session session=null;
		Transaction tx=null;
		
		try {
		
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			session.createQuery("update Teacher set l_name='Siripireddy' where l_name='s'" ).executeUpdate();
			
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
