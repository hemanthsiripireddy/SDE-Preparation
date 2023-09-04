package dao;

import java.util.List;

import entity.Student;

public interface StudentDao {
	
	public int insert(Student s);
	public int delete(Student s);
	public void delete(int id);
	public int update(Student s);
	public Student getStudent(int id);
	public List<Student> getAllStudents(int id);

}
