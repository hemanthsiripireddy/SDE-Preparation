package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;

import entity.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hTemp;

	public HibernateTemplate gethTemp() {
		return hTemp;
	}

	public void sethTemp(HibernateTemplate hTemp) {
		this.hTemp = hTemp;
	}

	@Transactional
	public int insert(Student s) {
		// TODO Auto-generated method stub
		hTemp.save(s);
		return 0;
	}
	@Transactional
	public int delete(Student s) {
		// TODO Auto-generated method stub
		hTemp.delete(s);
		return 0;
	}
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student s = hTemp.get(Student.class, 1);
		hTemp.delete(s);

	}
	@Transactional
	public int update(Student s) {
		// TODO Auto-generated method stub
		hTemp.update(s);
		return 0;
	}
	@Transactional
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return hTemp.get(Student.class, id);
	}
	@Transactional
	public List<Student> getAllStudents(int id) {
		// TODO Auto-generated method stub
		return hTemp.loadAll(Student.class);
	}

}
