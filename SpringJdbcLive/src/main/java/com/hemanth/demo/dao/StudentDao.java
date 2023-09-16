package com.hemanth.demo.dao;

import com.hemanth.demo.models.Student;

public interface StudentDao {
	
	public Student getSutdentById(int id);
	public Student create(Student student);

}
