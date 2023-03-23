package lecture.p1807print;

import java.io.*;

public class C01PrintWriter {
	public static void main(String[] args) {
		String name = "output/print1.txt";
		
		try (PrintWriter pw = new PrintWriter(name)) {
			pw.println(3333);
			pw.println(3.14);
			pw.println(true);
			pw.println("hello world");
			pw.println("슬램덩크");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
