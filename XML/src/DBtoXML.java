import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtoXML {

	
	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String user = "";
			String password = "";
			String dbPath = "D:\\java\\ileri\\xml\\ornek.mdb";
			String urlDB = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="	+ dbPath;

			// Connection con = DriverManager.getConnection("jdbc:odbc:test",
			// user, password);

			Connection con = DriverManager.getConnection(urlDB, user, password);
			Statement stmt = con.createStatement();
			String sql = "select * from kimlik";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int sutunSayisi = rsmd.getColumnCount();
			FileOutputStream fo = new FileOutputStream("personel.xml");
			PrintStream pr = new PrintStream(fo);
			pr.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			pr.println("<PersonelBilgi>");

			while (rs.next()) {
				pr.println("    <Personel>");
				for (int i = 1; i <= sutunSayisi; i++)
					pr.println("       <" + rsmd.getColumnName(i) + ">"
							+ rs.getString(i) + "</" + rsmd.getColumnName(i)
							+ ">");

				pr.println("    </Personel>");
			}
			pr.println("</PersonelBilgi>");
		} catch (ClassNotFoundException e) {
			System.out.println("surucu bulunamadi..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

