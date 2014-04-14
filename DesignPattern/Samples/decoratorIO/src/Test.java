import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("oku.txt");
			LowerCaseInputStream buf = new LowerCaseInputStream(
					new BufferedInputStream(fi));
			/*
			 * int c; while ((c = buf.read()) > 0) System.out.print((char) c);
			 */
			Scanner sc = new Scanner(buf);
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
