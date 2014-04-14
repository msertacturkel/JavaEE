import org.csystem.spring.SequenceGenerator1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SequenceGenerator1 seq = (SequenceGenerator1)context.getBean("sequenceGenerator5");
		System.out.println(seq.getSequence());
	}

}
