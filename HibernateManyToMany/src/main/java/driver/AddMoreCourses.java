package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Review;
import entity.Student;
import entity.Teacher;
import entity.TeacherDetails;

public class AddMoreCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(entity.Teacher.class)
				.addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			
			Course course1=new Course("React");
			Course course2=new Course("Hibernate");
			Student student1=new Student("Swetha");
			
			course1.addStudent(student1);
			course2.addStudent(student1);
			
			
			
			
		
	
			
			System.out.println("Saving Course");
			session.save(course1);
			session.save(course2);
			System.out.println("Saving students");
			session.save(student1);
			
			
			
			session.getTransaction().commit();
			session.close();
			factory.close();
			System.out.println("Completed Successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		


	}

}
