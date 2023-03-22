package ch118sec02.exam02;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("output/test.db2")) {
			byte[] array= { 10, 20, 30};
			os.write(array);
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
