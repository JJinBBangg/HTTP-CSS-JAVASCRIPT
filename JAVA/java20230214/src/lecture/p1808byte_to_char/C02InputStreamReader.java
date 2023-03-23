package lecture.p1808byte_to_char;

import java.io.*;

public class C02InputStreamReader {
	public static void main(String[] args) {
		String name ="output/byte1.txt";
		try (InputStream os = new FileInputStream(name);
				InputStreamReader osw = new InputStreamReader(os)) {
			int f1 = os.read();
			System.out.println((char) f1);
			int f2 = os.read();
			System.out.println((char) f2);
			int f3 = osw.read();
			System.out.println((char) f3);
			int f4 = osw.read();
			System.out.println((char) f4);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
