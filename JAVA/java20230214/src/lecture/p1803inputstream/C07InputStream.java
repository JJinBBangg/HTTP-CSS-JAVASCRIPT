package lecture.p1803inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "output/chicago.jpg";
		String des = "output/chicago_copy3.jpg";
		try (
				var is = new FileInputStream(src);
				var os = new FileOutputStream(des)) {
			is.transferTo(os);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
