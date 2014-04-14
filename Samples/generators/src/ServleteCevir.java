import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ServleteCevir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			FileInputStream fi = new FileInputStream(
					"e:\\javaileri\\benihatirla.html");
			FileOutputStream fo = new FileOutputStream(
					"e:\\javaileri\\benihatirla.txt");
			Scanner sc = new Scanner(fi);
			PrintStream out = new PrintStream(fo);
			out.println("response.setContentType(\"text/html\"); //MIME");
			out.println("PrintWriter out=response.getWriter()");
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				String yeni = satir.replace('\"', '\'');
				
				out.println("out.println(\"" + yeni + "\");");
			}

			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
