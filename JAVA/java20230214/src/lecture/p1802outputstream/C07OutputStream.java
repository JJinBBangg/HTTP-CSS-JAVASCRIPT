package lecture.p1802outputstream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output7.txt")) {
			// 한바이트 쓰기
			os.write(30);
			os.write(19294);

			// 여러바이트 쓰기
			byte[] data = { 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
			os.write(data); // ##

			// 여러바이트 쓰기 (배열의 일부분만 사용)
			os.write(data, 0, 3); //0번부터 3개
			os.write(data, 4, 5); //4번부터 5개
			os.write(data, 0, data.length); //0번부터 data의 길이만큼 사용 ##

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
