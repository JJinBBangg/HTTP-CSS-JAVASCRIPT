package lecture.p1805reader;

import java.io.*;

public class C01Reader {
	public static void main(String[] args) {
		try (Reader rd = new FileReader("output/writer1.txt")) {
			int data = 0;
			while((data = rd.read()) != -1) {
				System.out.println(data+" : "+(char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
