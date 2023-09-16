package com.hemanth.demo.configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.hemanth.demo.dao.StudentDao;
import com.hemanth.demo.dao.StudentDaoImpl;

@Configuration
@PropertySource("database.properties")
public class DataConfig {
	@Autowired
	Environment env;
	@Bean
	public DataSource dataSource() {
		//DataSource source =new 
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setUrl(env.getProperty("mysql.url"));
		source.setUsername(env.getProperty("mysql.username"));
		source.setPassword(env.getProperty("mysql.password"));
		source.setDriverClassName(env.getProperty("mysql.driver"));
		
				return source;
		
	}
	

}
