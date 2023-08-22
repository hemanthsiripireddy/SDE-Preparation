package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Review;
import entity.Student;
import entity.Teacher;
import entity.TeacherDetails;



public class InsertTeacherAndTeacherDetails {

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
			Teacher teacher1 =new Teacher("hemanth", "kumar", "h@gmail.com");
			TeacherDetails teacherDetails1=new TeacherDetails("tirupati", "reading");
			teacher1.setTeacherDetails(teacherDetails1);
			Teacher teacher2 =new Teacher("Sai", "Kiran", "s@gmail.com");
			TeacherDetails teacherDetails2=new TeacherDetails("tirupati", "cricket");
			teacher2.setTeacherDetails(teacherDetails2);
			session.beginTransaction();
			System.out.println("Saving the teacher");
			session.save(teacher1);
			session.save(teacher2);
			
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
