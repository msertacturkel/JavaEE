import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PersonelDAO {
	private Connection con;

	public void create(Personel personel) {
	}

	public void delete(Personel personel) {
	}

	public Personel findByAd(String ad) {
		Connection connect = getConnection();
		Personel personel = null;
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from kimlik where ad="
					+ ad);
			rs.next();
			personel = new Personel();
			
			
			personel.setSoyad(rs.getString("soyad"));
			personel.setMaas(rs.getInt("maas"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personel;
	}

	public List findAll() {
		return null;

	}

	public Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection("jdbc:odbc:deneme", "", "");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return con;
	}

}
