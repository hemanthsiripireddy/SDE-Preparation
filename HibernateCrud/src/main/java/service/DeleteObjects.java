package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class DeleteObjects {
	public static void deleteUsingDeleteMethod() {
		// this is for single object deletion
		System.out.println("Connecting to database");
				
				SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				System.out.println("created");
				
				Session session=null;
				Transaction tx=null;
				
				try {
				
					session=factory.getCurrentSession();
					tx=session.beginTransaction();
					Teacher t=session.get(Teacher.class, 3);
					
					session.delete(t);
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
	public static void deleteUsingCreateQuery() {
		System.out.println("Connecting to database");
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
		
		Session session=null;
		Transaction tx=null;
		
		try {
		
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			session.createQuery("delete Teacher where id='2'").executeUpdate();
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
