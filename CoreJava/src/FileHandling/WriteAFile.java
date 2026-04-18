package FIleHandling;

import java.io.FileWriter;

public class WriteAFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("demo.txt");

			writer.write("Hello this is Java File Handling");

			writer.close();

			System.out.println("Data Written Successfully");
			
	
		

		} catch (Exception e) {
			System.out.println("Exception Caught " + e);
		}
	}
}
