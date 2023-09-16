package com.hemanth.demo.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hemanth.demo.configurations.AppConfig;
import com.hemanth.demo.configurations.DataConfig;
import com.hemanth.demo.dao.StudentDao;
import com.hemanth.demo.models.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ct=new AnnotationConfigApplicationContext(AppConfig.class,DataConfig.class);
		StudentDao sd=ct.getBean(StudentDao.class);
		Student student=sd.getSutdentById(1);
		System.out.println(student);

	}

}
