package lecture.p1803inputstream;

import java.io.*;

public class C01InputStream {
	public static void main(String[] args) {
		// InputStream
		// byte 단위 입력 스트림
		// 주요 메소드 : read
		
		String name = "output/test1.db";
		try (InputStream is = new FileInputStream(name)) {
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read());
			System.out.println(is.read()); // 입력할 값이 없으면 -1 출력
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
