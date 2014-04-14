package DAOdbToPojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	private Connection con;

	public void create(Customer customer) {
	}

	public void delete(Customer customer) {
	}

	public List<Customer> findAll() {
		Connection connect = getConnection();
		Customer customer = null;
		List<Customer> customers=new ArrayList<Customer>();
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer");
			
			while(rs.next()){
			customer = new Customer();
			
			customer.setCustomernumber(rs.getInt("customernumber"));
			customer.setCustomername(rs.getString("customername"));
			customer.setContactlastname(rs.getString("contactlastname"));
			customer.setContactfirstname(rs.getString("contactfirstname"));
			customer.setPhone(rs.getString("phone"));
			customer.setAddressline1(rs.getString("addressline1"));
			customer.setAddressline2(rs.getString("addressline2"));
			customer.setCity(rs.getString("city"));
			customer.setState(rs.getString("state"));
			customer.setPostalcode(rs.getString("postalcode"));
			customer.setCountry(rs.getString("country"));
			customer.setSalesrepemployeenumber(rs.getInt("salesrepemployeenumber"));
			customer.setCreditlimit(rs.getDouble("creditlimit"));
			customers.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}

	     

	public Connection getConnection() {
		if (con == null) {
			try {
				//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//m   con = DriverManager.getConnection("jdbc:odbc:deneme", "", "");
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				 con = DriverManager.getConnection(
						"jdbc:derby://localhost:1527/myeclipse", "classiccars",
						"classiccars");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return con;
	}

}
