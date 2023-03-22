package lecture.p1802outputstream;

import java.io.*;

public class C04Close {
	public static void main(String[] args) {
		// try-with-resource 에 사용되는 코드가 복잡할 경우
		// try 밖으로 뺄 수 있음
		try (OutputStream os1 = new FileOutputStream("");
				OutputStream os2 = new FileOutputStream("");
				OutputStream os3 = new FileOutputStream("")) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try (os1; os2; os3) {

//		} catch (Exception e) {
//		}

	}
}
