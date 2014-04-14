import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StrutsGenerate {

	public StrutsGenerate() {
		FileInputStream fi;
		FileOutputStream fo;
		try {
			fi = new FileInputStream("dosya.txt");
			fo = new FileOutputStream("cikti.txt");
			PrintStream out = new PrintStream(fo);
			Scanner sc = new Scanner(fi);
			String satir;
			String actionName="personel";
			System.out.println("<html:form action=\"/"+actionName+"\">");
			out.println("<html:form action=\"/"+actionName+"\">");
			while (sc.hasNextLine()) {
				satir = sc.nextLine();
				Scanner sc1 = new Scanner(satir);
				String tip = sc1.next();
				String degisken = sc1.next();
				System.out.println("   " + degisken
						+ " : <html:text property=\"" + degisken
						+ "\"/><html:errors property=\"" + degisken
						+ "\"/><br/>");
				out.println("   " + degisken + " : <html:text property=\""
						+ degisken + "\"/><html:errors property=\"" + degisken
						+ "\"/><br/>");
			}
			System.out.println(" <html:submit/><html:cancel/>");
			out.println(" <html:submit/><html:cancel/>");
			System.out.println("</html:form>");
			out.println("</html:form>");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new StrutsGenerate();

	}

}
