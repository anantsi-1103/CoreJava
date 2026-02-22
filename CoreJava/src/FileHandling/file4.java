package FileHandling;

import java.io.File;

public class file4 {
	public static void main(String[] args) {
		File f = new File("demo.txt");

		if (f.delete()) {
			System.out.println("File Deleted");
		} else {
			System.out.println("File not Deleted");
		}
	}
}
