package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class ReadingObjects {
	public static void readObject() {
		System.out.println("Connecting to database");
		
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("created");
			
			Session session=null;
			Transaction tx=null;
			try {
			
				session=factory.getCurrentSession();
				tx=session.beginTransaction();
				Teacher t1=session.get(Teacher.class, 5);
				System.out.println(t1);
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
