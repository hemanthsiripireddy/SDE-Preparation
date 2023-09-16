package com.hemanth.demo.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hemanth.demo.constants.Constants;
import com.hemanth.demo.mappter.StudentMapper;
import com.hemanth.demo.models.Student;
import com.mysql.cj.exceptions.ClosedOnExpiredPasswordException;

@Component
public class StudentDaoImpl implements StudentDao {
	JdbcTemplate tp;

	

	public Student getSutdentById(int id) {
		// TODO Auto-generated method stub
		return tp.queryForObject("select * from student where id=?", new Object[] { id }, new StudentMapper());
	}

	public Student create(Student student) {
		// TODO Auto-generated method stub
		tp.update(
				"insert into student set " + Constants.StudentConstants.id + "= ?"
						+ Constants.StudentConstants.firstName + " =?" + Constants.StudentConstants.lastName + "= ?"
						+ Constants.StudentConstants.age + " =?",
				student.getId(), student.getFirstName(), student.getLastName(), student.getAge());
		return student;
	}

	public JdbcTemplate getTp() {
		return tp;
	}
	@Autowired
	public void setTp(DataSource s) {
		this.tp = new JdbcTemplate(s);
	}
	

}
