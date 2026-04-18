package FIleHandling;

import java.io.File;

public class CreateAFile {
	public static void main(String[] args) {

		try {

			File f = new File("demo.txt");

			if (f.createNewFile()) {
				System.out.println("File Created Succcessfully");
			} else {
				System.out.println("File Already Exist");
			}
		} catch (Exception e) {
			System.out.println("Exception Caught"+e);
		}
	}

}
