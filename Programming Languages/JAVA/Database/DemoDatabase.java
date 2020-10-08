import java.util.*;
import java.sql.*;

class DemoDatabase{
	public static void main(String args[])throws Exception{
		Scanner in=new Scanner(System.in);

		//register Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Create a database connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","System","admin");
		//create a statement
		 
	}
}