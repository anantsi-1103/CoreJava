package FileHandling;

import java.io.FileWriter;

public class file2 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("demo.txt");
//			truncate
			fw.write("\n hello SpringBoot");
			fw.close();
			System.out.println("Data Written Completed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
