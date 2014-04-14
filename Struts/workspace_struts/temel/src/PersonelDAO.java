


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonelDAO {
	private Connection con;
	private List<Personel> personels;

	public void create(Personel personel) {
	}

	public void delete(Personel personel) {
	}

	public List<Personel> getPersonels() {

		return findAll();
	}

	public Personel findById(int id) {
		Connection connect = getConnection();
		Personel personel = null;
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from personel where id="
					+ id);
			rs.next();
			personel = new Personel();
			personel.setId(id);
			personel.setAd(rs.getString("ad"));
			personel.setSoyad(rs.getString("soyad"));
			personel.setMaas(rs.getInt("maas"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personel;
	}

	public List<Personel> findAll() {
		Connection connect = getConnection();
		Personel personel = null;
		ArrayList<Personel> personelList = new ArrayList<Personel>();
		try {
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from personel");
			while (rs.next()) {
				personel = new Personel();
				personel.setId(rs.getInt("id"));
				personel.setAd(rs.getString("ad"));
				personel.setSoyad(rs.getString("soyad"));
				personel.setMaas(rs.getInt("maas"));
				personelList.add(personel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personelList;

	}

	public Connection getConnection() {
		if (con == null) {
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				con = DriverManager.getConnection(
						"jdbc:derby://localhost:1527/myeclipse", "classiccars",
						"classiccars");
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
