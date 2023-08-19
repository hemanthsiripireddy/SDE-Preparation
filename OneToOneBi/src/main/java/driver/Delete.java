package driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.TeacherDetails_OneToOne;
import entity.Teacher_OneToOne;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Connecting to database");

				SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(Teacher_OneToOne.class).addAnnotatedClass(TeacherDetails_OneToOne.class)
						.buildSessionFactory();
				System.out.println("created");
				
				Session session = null;
				Transaction tx = null;
				try {

					session = factory.getCurrentSession();
					tx = session.beginTransaction();
					TeacherDetails_OneToOne teacherDetails=session.get(TeacherDetails_OneToOne.class, 1);
					if(teacherDetails!=null) {
						session.delete(teacherDetails);
					}
					


					tx.commit();

				} catch (Exception e) {
					System.out.println("error");
					tx.rollback();
					e.printStackTrace();
				} finally {
					session.close();
				}

	}

}
