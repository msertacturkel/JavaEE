import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBSqLiteSorgu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\ileriJavaKasim2013\\MyIdefixDb.sqlite");
			System.out.println("baglanti saglandi..");			
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM CATEGORY");
			while(result.next()){
				System.out.println(result.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		



	}

}
