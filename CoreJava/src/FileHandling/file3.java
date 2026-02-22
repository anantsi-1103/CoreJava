package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class file3 {
	public static void main(String[] args) {
//		try {
//			File f = new File("demo.txt");
//			Scanner s = new Scanner(f);
//
//			while (s.hasNextLine()) {
//				System.out.println(s.nextLine());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {

			BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
			
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
