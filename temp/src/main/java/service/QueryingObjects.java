package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class QueryingObjects {
	public static void QueryObjects() {
		System.out.println("Connecting to database");
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
		
		Session session=null;
		Transaction tx=null;
		List<Teacher>teachers=null;
		try {
		
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			teachers=session.createQuery("from Teacher").list();
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
		for(Teacher t:teachers) {
			System.out.println(t);
		}
	}

}
