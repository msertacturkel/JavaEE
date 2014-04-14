import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class FiletoPojo {

	public FiletoPojo() {

		String dosyaAdi = "type.txt";
		String ciktiAdi = "";
		FileInputStream fi;

		try {
			fi = new FileInputStream(dosyaAdi);
			Scanner sc = new Scanner(fi);
			String sinifAdi = sc.nextLine();
			FileOutputStream fo = new FileOutputStream(sinifAdi + ".java");
			PrintStream out = new PrintStream(fo);
			System.out.println("public class " + sinifAdi + "{");
			out.println("public class " + sinifAdi + "{");
			Map<String, String> adTip = new HashMap<String, String>();
			while (sc.hasNextLine()) {
				String satir = sc.nextLine();
				StringTokenizer st = new StringTokenizer(satir);
				String tip = st.nextToken();
				String ad = st.nextToken();
				adTip.put(ad, tip);
			}
			Set<String> keys = adTip.keySet();
			for (String adk : keys) {
				System.out.println("   private " + adTip.get(adk) + " " + adk
						+ ";");
				out.println("   private " + adTip.get(adk) + " " + adk + ";");
			}
			System.out.println();
			System.out.println();
			out.println();
			out.println();
			for (String adk : keys) {
				System.out.println("    public " + adTip.get(adk) + "  get"
						+ adk + "(){");
				out.println("    public " + adTip.get(adk) + "  get" + adk
						+ "(){");
				System.out.println("      return " + adk + ";");
				out.println("      return " + adk + ";");
				System.out.println("    }");
				out.println("    }");

			}
			System.out.println("}");
			out.println("}");
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
		new FiletoPojo();
	}

}
