package designPattern.structural.fascadeDesign;

public class FascadeDesignExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without Fascade pattern
//		MySQLHelper msql=new MySQLHelper();
//		Connection c1=MySQLHelper.getConnnection();
//		msql.getHtmlReport("taable", c1);
//		
//		
//		OracleHelper o=new OracleHelper();
//		Connection c2=OracleHelper.getConnnection();
//		o.getPDFReport("table2", c2);

		// using fascade
		FascadeDesign.getReport(SqlType.MySQL, ReportType.PDF, "tableSai");
	}

}
class MySQLHelper{
	public static Connection getConnnection() {
		return new Connection();
	}
	public void getHtmlReport(String tableName, Connection con) {
		System.out.println("here is the HTML report of MySQl");
	}
	public void getPDFReport(String tableName, Connection con) {
		System.out.println("here is the PDF report of MySQl");
	}
	
}
class OracleHelper {
	public static Connection getConnnection() {
		return new Connection();
	}
	public void getHtmlReport(String tableName, Connection con) {
		System.out.println("here is the HTML report of Oracle");
	}
	public void getPDFReport(String tableName, Connection con) {
		System.out.println("here is the PDF report of Oracle");
	}
	
	
}
class FascadeDesign{
	public static void getReport(SqlType type,ReportType rt,String tableName) {
		switch(type) {
		case MySQL:
			MySQLHelper msh=new MySQLHelper();
			Connection c=MySQLHelper.getConnnection();
			if(rt==ReportType.HTML)
				msh.getHtmlReport(tableName, c);
			else 
				msh.getPDFReport(tableName, c);
			break;
		case Oracle:
			OracleHelper o=new OracleHelper();
			Connection c1= OracleHelper.getConnnection();
			if(rt==ReportType.HTML)
				o.getHtmlReport(tableName, c1);
			else
				o.getPDFReport(tableName, c1);
			break;
		}
		
	}
}
enum SqlType{
	MySQL,Oracle;
}
enum ReportType{
	PDF,HTML;
}
class Connection{
	
}
