package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Review;
import entity.Teacher;
import entity.TeacherDetails;

public class RetrieveCourseAndReviews {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(entity.Teacher.class).addAnnotatedClass(TeacherDetails.class)
						.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
				Session session=factory.getCurrentSession();
				try {
					session.beginTransaction();
					Course course =session.get(Course.class, 19);
					System.out.println(course);
					for(Review review:course.getReviews()) {
						System.out.println(review);
					}
					
					
				
					
					
					
					
					
					
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
