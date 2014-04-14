import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Muhasebe muh = new Muhasebe();
		//Iterator iter = muh.iterator();
		/*while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		for(Object per : muh){
			System.out.println(per);
		}*/
		Yazilim yaz = new Yazilim();
		/*MyIterator iter = yaz.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}*/
		for (Personel personel : yaz) {
			System.out.println(personel);
		}

	}
}
