package FileHandling;

import java.io.File;

public class file1 {
	public static void main(String[] args) {
		try {
			File file = new File("demo.txt");
			if (file.createNewFile()) {
				System.out.println("File Created");
			} else {
				System.out.println("File Already Exists");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
