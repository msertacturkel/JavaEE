import java.io.*;
import java.util.Scanner;

public class dosyaOku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("sayi.txt");
		Scanner sc;
		try {
			sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				Scanner sc1 = new Scanner(str);
				while (sc1.hasNextInt()) {
					int sayi = sc1.nextInt();
					System.out.print(sayi*sayi+"\t");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
