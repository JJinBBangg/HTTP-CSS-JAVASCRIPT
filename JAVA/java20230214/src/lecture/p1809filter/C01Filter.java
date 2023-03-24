package lecture.p1809filter;

import java.io.*;

public class C01Filter {
	public static void main(String[] args) {
		// stream 연결 가능
		String fileName = "output/byte1.txt";
		try (FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
