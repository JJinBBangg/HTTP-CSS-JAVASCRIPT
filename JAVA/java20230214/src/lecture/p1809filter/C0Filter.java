package lecture.p1809filter;

import java.io.*;

public class C0Filter {
	public static void main(String[] args) {
		String fileName ="output/byte1.txt";
		
		try (var fos = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			fos.write("찐빵");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
