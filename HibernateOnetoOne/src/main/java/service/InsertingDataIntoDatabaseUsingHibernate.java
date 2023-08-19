package service;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.TeacherDetails_OneToOne;
import entity.Teacher_OneToOne;

public class InsertingDataIntoDatabaseUsingHibernate {
	public static void main(String[] args) {
		System.out.println("Connecting to database");
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher_OneToOne.class).addAnnotatedClass(TeacherDetails_OneToOne.class).buildSessionFactory();
		System.out.println("created");
		Teacher_OneToOne ramesh=new Teacher_OneToOne("Ramesh","S","ramesh@gmai.com");
		TeacherDetails_OneToOne td=new TeacherDetails_OneToOne("Tirupati", "coding");
		ramesh.setTeacherDetails(td);
//		Teacher_OneToOne suresh=new Teacher_OneToOne("Sureah","Dharma","ramesh@gmai.com");
//		Teacher_OneToOne harish=new Teacher_OneToOne("Harish","K","ramesh@gmai.com");
		Session session=null;
		Transaction tx=null;
		try {
		
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			session.save(ramesh);
//			session.save(suresh);
//			session.save(harish);
			
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


