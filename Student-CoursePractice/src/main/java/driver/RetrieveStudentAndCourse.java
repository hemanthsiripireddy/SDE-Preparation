package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Student;

public class RetrieveStudentAndCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session=null;
		try {
			
			
			 session=factory.openSession();
			 session.beginTransaction();
			 Student s=session.get(Student.class, 1);
			 System.out.println(s);
			 
			
			 session.close();
			 factory.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
				

	}

}
