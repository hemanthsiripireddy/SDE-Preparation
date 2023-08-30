package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Student;

public class InsertStudentCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session=null;
		try {
			Student hemanth=new Student("hemanth");
			Student suresh=new Student("Suresh");
			Course course=new Course("Java");
			suresh.setCourse(course);
			hemanth.setCourse(course);
			
			 session=factory.openSession();
			 session.beginTransaction();
			 session.save(hemanth);
			 session.save(suresh);
			 session.save(course);
			 session.getTransaction().commit();
			 
			
			 session.close();
			 factory.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
				

	}

}
