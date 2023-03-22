package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
	public static void main(String[] args) {
		String src = "output/chicago.jpg";
		String des = "output/chicago_copy11.jpg";
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des)) {
			byte[] data = new byte[1024];
			while(true) {
				int num = is.read(data);
				if(num== -1) break;
				os.write(data, 0, num);
			}
			
			os.flush();
			os.close();
			is.close();
			System.out.println("복사가 잘되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
