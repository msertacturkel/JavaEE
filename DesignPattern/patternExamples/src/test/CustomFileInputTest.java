package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.darklord.decorator.FrequencyCountedInputStream;

public class CustomFileInputTest implements Runnable {

	@Override
	public void run() {
		String fileName;
		
		System.out.print("Enter file name: ");
		
		try {
			
			BufferedReader keyReader = new BufferedReader(
					new InputStreamReader(System.in));
			
			fileName = keyReader.readLine();
			
			InputStream in =
				new FrequencyCountedInputStream(
						new BufferedInputStream(
								new FileInputStream(fileName)
								)
						);
			
			BufferedReader fileReader = new BufferedReader(
					new InputStreamReader(in));
			
			String line;
			
			System.out.println("File : " + fileName + "\n");
			
			while ((line = fileReader.readLine()) != null)
				System.out.println(line);
			
			System.out.println("------ End of File -------\n");
			System.out.println("Words and their frequencies:\n");
			
			FrequencyCountedInputStream fcin = (FrequencyCountedInputStream)in;
			
			int i = 0;
			
			for (String word : fcin) {
				System.out.println(word + " - " + fcin.getValue(word));
				i++;
			}
			
			System.out.println("\nNumber of words : " + i);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
