package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonelDao {

	private Connection connection;
	private String user = "classiccars";
	private String password = "classiccars";

	public void save(Personel personel) {

	}

	public void delete(Personel personel) {

	}
	public List<Personel> findByAd(String ad) {
		Connection con = getConnection();
		List<Personel> per = new ArrayList<Personel>();
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from Personel where ad='"+ad+"'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Personel personel = new Personel();
				personel.setId(rs.getInt("id"));
				personel.setAd(rs.getString("ad"));
				personel.setSoyad(rs.getString("soyad"));
				personel.setMaas(rs.getInt("maas"));
				per.add(personel);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return per;
	}
	public List<Personel> findAll() {
		Connection con = getConnection();
		List<Personel> per = new ArrayList<Personel>();
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from Personel";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Personel personel = new Personel();
				personel.setId(rs.getInt("id"));
				personel.setAd(rs.getString("ad"));
				personel.setSoyad(rs.getString("soyad"));
				personel.setMaas(rs.getInt("maas"));
				per.add(personel);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return per;
	}

	public Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				String url = "jdbc:derby://localhost:1527/myeclipse";
				connection = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return connection;
	}
}
