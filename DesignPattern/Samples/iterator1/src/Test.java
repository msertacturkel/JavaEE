public class Test {
	public static void main(String[] args) {
		
		Muhasebe muh = new Muhasebe();
		MyIterator iter = muh.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		Yazilim yaz = new Yazilim();
		MyIterator iter1 = yaz.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		

	}

}
