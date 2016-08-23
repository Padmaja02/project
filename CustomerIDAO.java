

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerIDAO {
	public boolean insertCustomer(Customer c) throws SQLException ;
	public ArrayList<Customer> getAllCustomers() throws SQLException ;
	
}
