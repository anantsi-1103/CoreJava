package FIleHandling;

import java.io.File;
import java.util.Scanner;

public class ReadAFile {
	public static void main(String[] args) {

		try {

//			FileReader fr = new FileReader("demo.txt");
//
//			int ch;
//
//			while ((ch = fr.read()) != -1) {
//				System.out.print((char) ch);
//			}
//			fr.close();

			File file = new File("demo.txt");

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		} catch (Exception e) {
			System.out.println("Exception Caught " + e);
		}

	}
}
