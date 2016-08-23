

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerIDAO {

	@Override
	public boolean insertCustomer(Customer c) throws SQLException{
		// TODO Auto-generated method stub
		Connection co = ConnectionManager.getConnection();
		Statement stmt = co.createStatement();
		int cno = c.getCustomerNo();
		String cname = c.getCustomerName();
		String address = c.getAddress();
		String itempur = c.getItemPurchased();
		int itemId = c.getItemId();
	
       stmt.executeUpdate("insert into customer_xbbl6b2kish values('"+cno+"','"+cname+"','"+address+"','"+itempur+"','"+itemId+"')");

		return true;
	}

	@Override
	public ArrayList<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		Connection co = ConnectionManager.getConnection();
		Statement stmt = co.createStatement();
		ArrayList<Customer> clist = new ArrayList<Customer>();
		Customer cust=new Customer();
		ResultSet rs = stmt.executeQuery("select * from customer_xbbl6b2kish");
		int cno,itemid;
		String cname,address,itempur;
	/**	ResultSet rs1 = stmt.executeQuery("SELECT COUNT(customerNo) as ccount FROM customer_xbbl5y7");
		int csize =rs1.getInt("ccount");*/
		while(rs.next()) 
		{
			cno = rs.getInt("customerNo");
			cust.setCustomerNo(cno);
			cname = rs.getString("customerName");
			cust.setCustomerName(cname);
			address = rs.getString("address");
			cust.setAddress(address);
			itempur=rs.getString("itemPurchased");
			cust.setItemPurchased(itempur);
			itemid = rs.getInt("itemId");
			cust.setItemId(itemid);
			clist.add(cust);
			//cu = clist.toArray(cu);
		
	}//while
		return clist;
	}

}
