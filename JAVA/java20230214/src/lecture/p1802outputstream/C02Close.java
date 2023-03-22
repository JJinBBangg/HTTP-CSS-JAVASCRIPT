package lecture.p1802outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		OutputStream os = null; // finally 블럭에서 사용할 수 있게 try블럭 밖에서 선언
		try {
			os = new FileOutputStream("output/output.txt");
			// 스트림 열고
			// 어떤작업
			os.write(1);

			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 꼭 해야함
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
