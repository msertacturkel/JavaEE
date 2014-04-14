import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DerbySorgula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			String url="jdbc:derby://localhost:1527/myeclipse";
		    String user="classiccars";
		    String password="classiccars";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("baglanti saglandi..");			
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("SELECT * FROM Personel");
			while(result.next()){
				System.out.println(result.getString(2));
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
