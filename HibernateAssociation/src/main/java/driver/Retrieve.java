package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Laptop;
import entity.Student;

public class Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		try {
			Session session=factory.openSession();
			session.beginTransaction();
			Student s=session.get(Student.class, 1);
			System.out.println(s);
			System.out.println(s.getLaptop().get(0));
			System.out.println(s.getLaptop().get(1));
			session.getTransaction().commit();
			session.close();
			factory.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
