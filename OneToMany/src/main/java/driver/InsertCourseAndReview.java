package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Review;
import entity.Teacher;
import entity.TeacherDetails;

public class InsertCourseAndReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(entity.Teacher.class).addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Teacher teacher =session.get(Teacher.class, 2);
			
			
			Course c1=new Course("html");
			
			teacher.add(c1);
			Review r1=new Review("Superb");
			Review r2=new Review("really good");
			Review r3=new Review("Nice course");
			c1.add(r3);
			c1.add(r2);
			c1.add(r1);
			
			
			session.update(teacher);
			session.save(c1);
			
			
			
			
			
			
			session.getTransaction().commit();
			System.out.println("Completed Successfully");
			session.close();
			factory.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
