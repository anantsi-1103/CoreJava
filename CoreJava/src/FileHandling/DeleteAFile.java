package FIleHandling;

import java.io.File;

public class DeleteAFile {
	public static void main(String[] args) {

		File f = new File("demo.txt");

		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());

		if (f.delete()) {
			System.out.println("File Deleted");
		} else {
			System.out.println("Delete Failed");
		}

	}
}
