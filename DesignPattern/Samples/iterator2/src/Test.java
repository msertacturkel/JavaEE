import java.util.Iterator;

public class Test {
	public static void main(String[] args) {

		Muhasebe muh = new Muhasebe();
		/*Iterator iter = muh.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		for (Personel personel : muh) {
			System.out.println(personel);
		}

		Yazilim yaz = new Yazilim();
		/*Iterator iter1 = yaz.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}*/
		
		for (Personel personel : yaz) {
			System.out.println(personel);
		}

	}

}
