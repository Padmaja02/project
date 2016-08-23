
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public class CreateCustomerTable {

	public static void main(String args[]) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.232.71.29:1521:INATP02","shobana","shobana");


			SQLWarning w = con.getWarnings();

			while(w != null) {
				System.out.println(w.getMessage());
				System.out.println(w.getSQLState());
				System.out.println(w.getErrorCode());
				w = w.getNextWarning();
			}

			con.setAutoCommit(false);

			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());

			Statement stmt = con.createStatement();
		  stmt.execute("create table customer_xbbl6b2kish(customerNo int,customerName varchar(10),address varchar(20),itemPurchased varchar(10),itemId int)");
			//stmt.execute("select * from customer_xbbl5y7");
		  con.commit();
			con.close();

		}catch(SQLException e) {
			e.printStackTrace();
	}

	}
}

