import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GenHTMLGirisTablo {
	// genHTMLGirisTablo.txt dosyasindan(proje dizininde olmali)
	// girdigi bilgilerden tablolu HTML giris kod parcasi uretir.
	// Submit ve Reset dugmesi de otomatik uretilir. JSP'de kullanilabilir.
	// <body></body> etiketlerinin icine dogrudan konulmalidir.
	// CSS'li versiyonu da ayrica uretilebilir.
	//Sonuclar hem ekrana hem de ghgt_out.txt dosyasina yaziliyor
	//Ilk sutun etiket ikinci sutun degisken ismini belirtecek
	//orn:(Ad,ad) Sonuc: <tr><td>Ad</td><input type="text" name="ad"/></td></tr>

	public GenHTMLGirisTablo() {
		String dosyaAdi = "genHTMLGirisTablo.txt";
		String ciktiAdi = "ghgt_out.txt";
		FileInputStream fi;
		try {
			fi = new FileInputStream(dosyaAdi);
			Scanner sc = new Scanner(fi);			
			FileOutputStream fo = new FileOutputStream(ciktiAdi);
			PrintStream out = new PrintStream(fo);
			String formHeader="<form action=\"\"> <!--action doldurulmali -->";
			String formClose="</form>";
			String tableHeader="<tablo border=\"1\">";
			String tableClose="</table>";
			System.out.println(formHeader);
			out.println(formHeader);
			System.out.println(tableHeader);
			out.println(tableHeader);
			while(sc.hasNextLine()){
				String satir=sc.nextLine();
				StringTokenizer st=new StringTokenizer(satir,",");
				String etiket=st.nextToken();
				String props=st.nextToken();
				System.out.println("<tr><td>"+etiket+"</td><td><input type=\"text\" name=\""+props+"\"></td></tr>");
				out.println("<tr><td>"+etiket+"</td><td><input type=\"text\" name=\""+props+"\"></td></tr>");
			}
			System.out.println("<tr><td></td><td><input type=\"submit\" value=\"submit\"/>");
			out.println("<tr><td></td><td><input type=\"submit\" value=\"submit\"/>");
			System.out.println("<input type=\"reset\" value=\"reset\"/></td></tr>");
			out.println("<input type=\"reset\" value=\"reset\"/></td></tr>");
			System.out.println(tableClose);
			out.println(tableClose);
			System.out.println(formClose);
			out.println(formClose);
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {

		new GenHTMLGirisTablo();

	}

}
