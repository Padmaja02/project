

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection getConnection()
	{
		Connection con=null;
		try{

			
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	          System.out.println("driver loaded");
	 	 //creating connection with the database 
	         con = DriverManager.getConnection("jdbc:oracle:thin:@10.232.71.29:1521:INATP02","shobana","shobana");
		}
		catch(Exception e)
	      {
	          e.printStackTrace();
	      }
		System.out.println("Connection Successful!!");
return con;
}
}
