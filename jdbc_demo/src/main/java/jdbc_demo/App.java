package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDao booksDoa=new BookDao();
		

		try {
			//creating the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root",
					"1708124281@Sql");
			//access a statement
			Statement stmt=connection.createStatement();
			int input;
			do {
				System.out.println("Book Dao");
				System.out.println("1 Display");
				System.out.println("2 Insert");
				System.out.println("3: modify");
				System.out.println("4: delete");
				Scanner sc=new Scanner(System.in);
				input =sc.nextInt();
				switch(input) {
				case 1:
					booksDoa.getAllBooks(stmt);
					break;
				case 2:
					booksDoa.saveData(connection);
					break;
				case 3:
					booksDoa.updateBook(stmt);
					break;
				case 4:
					booksDoa.deleteBook(stmt);
					break;
				default :
					break;
				}
				
			}while(input>0);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
