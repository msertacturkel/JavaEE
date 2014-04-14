import java.util.List;

import org.csystem.spring.Personel;
import org.csystem.spring.PersonelDAO;
import org.csystem.spring.PersonelData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonelDAO pDao=(PersonelDAO)context.getBean("persDAO");
        List<Personel> pers = pDao.listAll();
        for (Personel personel : pers) {
			System.out.println(personel.getAd());
		}
	}

}
