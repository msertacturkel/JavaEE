import org.csystem.spring.Customer;
import org.csystem.spring.CustomerDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");	
		CustomerDAO dao = (CustomerDAO) ac.getBean("CustomerDAO");
		System.out.println(dao);
		Customer cus = dao.findById(103);
		System.out.println(cus.getContactfirstname());


	}

}
