package lecture.p1806buffered;

import java.io.*;

public class C02BufferedInputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		
		try (InputStream fos = new FileInputStream(name);
				InputStream is = new BufferedInputStream(fos)) {
			
			long start = System.nanoTime();
			while(is.read() != -1) {
				
			}
			long end = System.nanoTime();
			System.out.println(end - start);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
