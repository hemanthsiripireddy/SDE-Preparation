package client;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import entity.Employee;

public class Main {
	
	static JdbcTemplate jdbcTemplate;
	static SimpleDriverDataSource dataSourceOBJ;
	
	//configure database
	static String USERNAME="root";
	static String PASSWORD="1708124281@Sql";
	static String URL ="jdbc:mysql://localhost:3306/springjdbc";
	public static SimpleDriverDataSource getDatabaseConnection() {
		dataSourceOBJ=new SimpleDriverDataSource();
		try {
			dataSourceOBJ.setDriver(new com.mysql.cj.jdbc.Driver());
			dataSourceOBJ.setUrl(URL);
			dataSourceOBJ.setUsername(USERNAME);
			dataSourceOBJ.setPassword(PASSWORD);
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataSourceOBJ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//springjdbc
		//creating connection
		//inform the spring code about database
		// setting driver class
		//SQL Insert Query
		jdbcTemplate =new JdbcTemplate(getDatabaseConnection());
		
		if(jdbcTemplate!=null) {
			String sqlInsertQuery="insert into employee (name,email,address,phoneno) value(?,?,?,?)";
//			for(int i=1;i<=5;i++) {
//				jdbcTemplate.update(sqlInsertQuery,"Employee"+i,"siripi@gmail.com"+i,"chennai"+i,"1234"+i);
//			}
			//SQL update
			
//			String sqlUpdateQuery="update employee set email=? where name=?";
//			jdbcTemplate.update(sqlUpdateQuery,"admin@gmail.com","Employee2");
			//SQL Read
			
			String sqlSelectQuery="Select name,email,address,phoneno from employee";
			List listEmployee =jdbcTemplate.query(sqlSelectQuery, new RowMapper() {
				public Employee mapRow(ResultSet result,int rowNum) throws SQLException{
					Employee emp=new Employee();
					emp.setName(result.getString("name"));
					emp.setEmail(result.getString("email"));
					emp.setAddress(result.getString("address"));
					emp.setPhoneno(result.getString("phoneno"));
					return emp;
				}
			});
			System.out.println(listEmployee);
			//SQL Delete
			String sqlDeleteQuery="delete from employee where name=?";
			jdbcTemplate.update(sqlDeleteQuery,"Employee1");
			//Close the connection
			
			
			
		}else {
			System.out.println("Connection is not established");
		}
		
		
		

	}

}
