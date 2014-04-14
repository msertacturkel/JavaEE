import java.util.List;


public class CustomerDAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerDAO perDAO = new CustomerDAO();		
		List<Customer> customers = perDAO.findAll();
		for (Customer customer : customers) {
			System.out.println(customer.getContactfirstname());
		}
	}

}
