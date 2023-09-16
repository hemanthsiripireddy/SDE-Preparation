package com.hemanth.demo.mappter;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hemanth.demo.constants.Constants;
import com.hemanth.demo.models.Student;

public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(rs.getString(Constants.StudentConstants.id));
		
		student.setFirstName(rs.getString(Constants.StudentConstants.firstName));
		student.setLastName(rs.getString(Constants.StudentConstants.lastName));
		student.setAge(rs.getString(Constants.StudentConstants.age));
		
		return student;
	}

	

}
