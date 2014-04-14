import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBSorguMSSql {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433;databaseName=Bute";
			String user="sa";
			String password="12345";
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("baglanti saglandi");
			Statement stmt = con.createStatement();
			String sql="select * from musteri";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				System.out.println(rs.getString(2));
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
