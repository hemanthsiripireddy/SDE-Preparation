package driver;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Course;
import entity.Teacher;
import entity.TeacherDetails;

public class InsertCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(entity.Teacher.class).addAnnotatedClass(TeacherDetails.class)
						.addAnnotatedClass(Course.class).buildSessionFactory();
				Session session=factory.getCurrentSession();
				try {
					session.beginTransaction();
					Teacher teacher =session.get(Teacher.class, 1);
					
					Course c1=new Course("Java");
					Course c2=new Course("Python");
					teacher.add(c1);
					teacher.add(c2);
					session.save(c1);
					session.save(c2);
					
					
					
					session.update(teacher);
					
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
