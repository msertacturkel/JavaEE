import java.util.List;




public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonelDAO perDAO = new PersonelDAO();
		Personel pers = perDAO.findById(2);
		List<Personel> perList = perDAO.findAll();
		for (Personel personel : perList) {
			System.out.println(personel.getAd());
		}


	}

}
