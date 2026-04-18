package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class throwsCode {
	public static void main(String[] args) {
		try {
			readFile();
		} catch (Exception e) {
			System.out.println("File not Found");
		}

	}

	public static void readFile() throws IOException {
		FileReader fr = new FileReader("file.txt");
	}
}
