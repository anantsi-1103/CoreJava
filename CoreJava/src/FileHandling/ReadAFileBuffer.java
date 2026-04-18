package FIleHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ReadAFileBuffer {
	public static void main(String[] args) {
		try {

//			FileReader fr = new FileReader("demo.txt");
//			BufferedReader br = new BufferedReader(fr);

			BufferedWriter br = new BufferedWriter(new FileWriter("demo.txt", true));

			br.write("\nthis data is appended data");
			
			System.out.println("Data written ");
			br.close();

		} catch (Exception e) {
			System.out.println("Exception Caught " + e);
		}
	}
}
