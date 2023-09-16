package jdbc_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class BookDao {
	
	public void getAllBooks(Statement stmt) throws SQLException {
		String str="select title, price, qty from books";
		ResultSet rs=stmt.executeQuery(str);
		int rowCounter=0;
		while(rs.next()) {
			String title =rs.getString("title");
			String price=rs.getString("price");
			String qty=rs.getString("qty");
			System.out.println("the data= ");
			System.out.println("Title= "+title);
			System.out.println("price = "+price);
			System.out.println("qty= "+qty);
			
		}
		
	}
	public void saveData(Connection connection) throws SQLException {
		String str="insert into books (id,title,author) values (?,?,?)";
		PreparedStatement psts=connection.prepareStatement(str);
		psts.setInt(1, 1005);
		psts.setString(2, "threee idiots");
		psts.setString(3, "Chethan");
		int row=psts.executeUpdate();
		
	}
	public void deleteBook(Statement stmt) throws SQLException {
		String str="delete from books where id<=1002";
		int counter=stmt.executeUpdate(str);
		System.out.println("the deleted record "+stmt);
		
	}
	public void updateBook(Statement stmt) throws SQLException {
		String str="update books set price = 45.8 where id =1005";
		int counter=stmt.executeUpdate(str);
		System.out.println(counter);
		
	}

}
