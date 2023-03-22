package lecture.p1803inputstream;

import java.io.*;

public class C03InputStream {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/output6.txt")) {
			byte[] arr = new byte[5];
			int len1 = is.read(arr);
			int len2 = is.read(arr);
			int len3 = is.read(arr);
			int len4 = is.read(arr);
			System.out.println(len1);
			System.out.println(len2);
			System.out.println(len3);
			System.out.println(len4);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
