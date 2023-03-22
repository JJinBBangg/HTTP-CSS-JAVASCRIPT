package lecture.p1803inputstream;

import java.io.*;

public class C05InputStream {
	public static void main(String[] args) {
		String src = "output/chicago.jpg";
		String des = "output/chicago_copy.jpg";
		try (
				var is = new FileInputStream(src);
				var os = new FileOutputStream(des)) {
			int data = 0;
			
			while((data = is.read()) != -1) {
				os.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
}
