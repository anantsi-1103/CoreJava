package FIleHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class WriteAFileWriter {
	public static void main(String[] args) {
		try {

//			FileReader fr = new FileReader("demo.txt");
//			BufferedReader br = new BufferedReader(fr);

			BufferedReader br = new BufferedReader(new FileReader("demo.txt"));

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			

			br.close();

		} catch (Exception e) {
			System.out.println("Exception Caught " + e);
		}
	}
}
