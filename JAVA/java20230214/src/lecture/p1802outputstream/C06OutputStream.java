package lecture.p1802outputstream;

import java.io.*;

public class C06OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output6.txt")) {
			// 한 바이트 쓰기
			os.write(12345);
			os.write(1223425);

			// 여러바이트 쓰기
			byte[] data = { 3, 1, 0, 127, 64 };
			os.write(data);
			os.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
