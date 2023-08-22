package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Teacher;
import entity.TeacherDetails;

public class RetrieveTeacherAndCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(entity.Teacher.class).addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Teacher teacher =session.get(Teacher.class, 1);
			System.out.println(teacher);
			for(Course course:teacher.getCourses()) {
				System.out.println(course);
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
