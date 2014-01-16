import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySqlDAO {
	public List<Personel> findAll() {
		List<Personel> pers=new ArrayList<Personel>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://egitmen-pc:3306/test", "root", "admin");
			Statement stmt=con.createStatement();
			String sql="select * from personel";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				Personel per=new Personel();
				per.setId(rs.getInt(1));
				per.setAd(rs.getString(2));
				per.setSoyad(rs.getString(3));
				per.setMaas(rs.getInt(4));
				pers.add(per);
			}
			return pers;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
