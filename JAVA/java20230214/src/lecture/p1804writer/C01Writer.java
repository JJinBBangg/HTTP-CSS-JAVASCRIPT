package lecture.p1804writer;

import java.io.*;

public class C01Writer {
	public static void main(String[] args) {
		// Writer : 문자단위 출력 스트림
		// 주요 메소드 : write
		String fileName = "output/writer1.txt";
		try (Writer wr = new FileWriter(fileName)) {
			wr.write('찐');
			wr.write('빵');
			
			wr.write(106); // 유니코드
			wr.write(106); // 유니코드
			wr.write(105); // 유니코드
			wr.write(110); // 유니코드
			wr.write(98); // 유니코드
			wr.write(98); // 유니코드
			wr.write(97); // 유니코드
			wr.write(110); // 유니코드
			wr.write(103); // 유니코드
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행완료");
	}
}
