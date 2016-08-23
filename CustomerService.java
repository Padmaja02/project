

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerService
 */
@WebServlet("/CustomerService")
public class CustomerService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Customer c = new Customer();
       System.out.println("Enter the customer number:");
       int cno = Integer.parseInt(br.readLine());
       c.setCustomerNo(cno);
       System.out.println("Enter the customer name:");
       String cname = br.readLine();
       c.setCustomerName(cname);
       System.out.println("Enter the address:");
       String address = br.readLine();
       c.setAddress(address);
       System.out.println("Enter the item purchased:");
       String ipurchase=br.readLine();
       c.setItemPurchased(ipurchase);
       System.out.println("Enter the item id:");
       int iid = Integer.parseInt(br.readLine());
       c.setItemId(iid);
 
        try {
        	CustomerDAOImpl cimp = new CustomerDAOImpl();
			cimp.insertCustomer(c);
		
        
        System.out.println("Do you want to get all customer details, yes or no ?");
        String ch = br.readLine();
        if(ch.equalsIgnoreCase("yes"))
        {
        	ArrayList<Customer> clist= cimp.getAllCustomers();
        	//for(int i=0;i<clist.size();i++)
        	//{
        		System.out.println(clist.get(5).getCustomerNo());
        		System.out.println(clist.get(5).getCustomerName());
        		System.out.println(clist.get(5).getItemId());
        		System.out.println(clist.get(5).getAddress());
        		System.out.println(clist.get(5).getItemPurchased());
        	//}
        	//System.out.println(clist);
        	
        }
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
