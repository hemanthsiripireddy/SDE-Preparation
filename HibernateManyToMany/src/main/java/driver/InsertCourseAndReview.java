package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Review;
import entity.Student;
import entity.Teacher;
import entity.TeacherDetails;

public class InsertCourseAndReview {

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
			Teacher teacher =session.get(Teacher.class, 1);
			Course course1=new Course("HTML");
			Review r1=new Review("Super course");
			Review r2=new Review("nice course");
			Review r3=new Review("best course");
			course1.add(r1);
			course1.add(r2);
			course1.add(r3);
			//session.save(course1);
//			session.save(r1);
//			session.save(r2);
//			session.save(r3);
			
			teacher.add(course1);
			
			
			System.out.println("Saving the teacher");
			session.save(course1);
			
			
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
