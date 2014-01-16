import java.util.List;


public class DAOTest {

	public static void main(String[] args) {
		MySqlDAO mdao=new MySqlDAO();
		List<Personel> personeller=mdao.findAll();
		for (Personel personel : personeller) {
			System.out.println(personel.getAd());
		}

	}

}
