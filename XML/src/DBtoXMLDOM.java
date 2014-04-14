import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DBtoXMLDOM {

	public static void main(String[] args) {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String user = "";
			String password = "";
			String dbPath = "D:\\java\\ileri\\xml\\ornek.mdb";
			String urlDB = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="
					+ dbPath;

			// Connection con = DriverManager.getConnection("jdbc:odbc:test",
			// user, password);

			Connection con = DriverManager.getConnection(urlDB, user, password);
			Statement stmt = con.createStatement();
			String sql = "select * from kimlik";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			int sutunSayisi = rsmd.getColumnCount();
			FileOutputStream fo = new FileOutputStream("personel1.xml");

			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element kokEleman = doc.createElement("PersonelBilgi");
			doc.appendChild(kokEleman);
			// Personel elemani olusturuluyor(root'a eklenecek)
			
			// Veri tabani satir satir okunuyor

			while (rs.next()) {
				Element personel = doc.createElement("Personel");
				for (int i = 1; i <= sutunSayisi; i++) {
					// sutun elemani olusuyor
					Element sutunAd = doc.createElement(rsmd.getColumnName(i));
					// sutun elemaninin icine text konuyor
					sutunAd.appendChild(doc.createTextNode(rs.getString(i)));
					// sutun personele ekleniyor
					personel.appendChild(sutunAd);
				}
				// personel elemani root'a ekleniyor
				

				kokEleman.appendChild(personel);
				// Elde edilen dom ekran veya dosyaya yaziliyor

			}
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(fo);// dosyaya
			transformer.transform(source, result);
			System.out.println("kaydedildi");
		} catch (ClassNotFoundException e) {
			System.out.println("surucu bulunamadi..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
