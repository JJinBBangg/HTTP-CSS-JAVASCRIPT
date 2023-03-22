package lecture.p1802outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		// try-with-resources
		//자동으로 닫아줌
		try (OutputStream os = new FileOutputStream("")) {
			os.write(1);
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
