package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;

import entity.Teacher;
import entity.TeacherDetails;



public class InsertTeacherAndTeacherDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(entity.Teacher.class).addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			Teacher teacher =new Teacher("hemanth", "kumar", "h@gmail.com");
			TeacherDetails teacherDetails=new TeacherDetails("tirupati", "chennai");
			teacher.setTeacherDetails(teacherDetails);
			session.beginTransaction();
			System.out.println("Saving the teacher");
			session.save(teacher);
			
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
