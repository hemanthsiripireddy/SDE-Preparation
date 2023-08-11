package service;





import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Test {
	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("created");
//		Teacher t=new Teacher("hemanth","S","dug@gmai.com");
//		Session session=null;
//		Transaction tx=null;
//		try {
//			session=factory.getCurrentSession();
//			tx=session.beginTransaction();
//			session.save(t);
//			tx.commit();
//			
//		}
//		catch(Exception e) {
//			System.out.println("error");
//			tx.rollback();
//			e.printStackTrace();
//		}
//		finally {
//			session.close();
//		}
	}

}

