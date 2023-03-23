package lecture.p1806buffered;

import java.io.*;

public class C04BufferedInputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		
		try (InputStream fis = new FileInputStream(name)) {
			
			long start = System.nanoTime();
			while(fis.read() != -1) {
				
			}
			long end = System.nanoTime();
			System.out.println(end - start);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
