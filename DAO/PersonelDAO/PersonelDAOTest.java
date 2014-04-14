
public class PersonelDAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonelDAO perDAO = new PersonelDAO();
		Personel pers = perDAO.findByAd("Vural");
		System.out.println(pers.getAd());
	}

}
