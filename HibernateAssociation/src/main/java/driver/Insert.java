package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Laptop;
import entity.Student;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Student s=new Student(1,"hemanth");
		
		Laptop l=new Laptop(101,"dell");
		Laptop l2=new Laptop(102,"hp");
		
		l.setStudent(s);
		l2.setStudent(s);
		
		try {
			Session session=factory.openSession();
			session.beginTransaction();
			session.save(s);
			session.save(l);
			session.save(l2);
			session.getTransaction().commit();
			session.close();
			factory.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
