import java.util.List;


public class EmployeeDAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeDAO perDAO = new EmployeeDAO();		
		List<Employee> emps = perDAO.findAll();
		for (Employee employee : emps) {
			System.out.println(employee.getLastname());
		}
	}

}
