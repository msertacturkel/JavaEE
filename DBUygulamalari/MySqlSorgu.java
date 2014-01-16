import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlSorgu {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://egitmen-pc:3306/test", "root", "admin");
			Statement stmt=con.createStatement();
			String sql="select * from personel";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(2)+"\t"+rs.getString(3));
				
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
