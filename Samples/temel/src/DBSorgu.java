import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class DBSorgu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/myeclipse", "classiccars","classiccars");
		    Statement stmt = con.createStatement();
		    String sql="select * from customer";
		    ResultSet rs = stmt.executeQuery(sql);
		    ResultSetMetaData rsmd = rs.getMetaData();
		    int sutun = rsmd.getColumnCount();
		    while(rs.next()){
		    	for (int i = 1; i <=sutun; i++) {
					System.out.print(rs.getString(i)+"\t");
				}
		    	System.out.println();
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
