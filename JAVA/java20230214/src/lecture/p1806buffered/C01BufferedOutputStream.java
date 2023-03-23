package lecture.p1806buffered;

import java.io.*;

public class C01BufferedOutputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		try (OutputStream fos = new FileOutputStream(name);
				OutputStream os = new BufferedOutputStream(fos)) {
			long start = System.nanoTime();
			for(int i = 0; i < 1000_000; i++) {
				os.write(1);
			}
			os.flush();
			long end = System.nanoTime();
			System.out.println(end-start);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
