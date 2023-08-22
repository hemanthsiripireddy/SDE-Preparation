package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Review;
import entity.Student;
import entity.Teacher;
import entity.TeacherDetails;

public class CreateCourseAndStudent {

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
			Teacher teacher=new Teacher("dasari","chitra","dc@gmail.com");
			session.beginTransaction();
			
			Course course1=new Course("React");
			Student student1=new Student("rakesh");
			Student student2=new Student("mukesh");
			course1.addStudent(student1);
			course1.addStudent(student2);
			
			
			teacher.add(course1);
		
			
			
			System.out.println("Saving the teacher");
			session.save(teacher);
			
			System.out.println("Saving Course");
			session.save(course1);
			System.out.println("Saving students");
			session.save(student1);
			session.save(student2);
			
			
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
