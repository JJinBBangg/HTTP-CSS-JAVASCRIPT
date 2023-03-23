package lecture.p1807print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		String name = "output/print2.txt";
		try (var pw = new PrintStream(name)) {
			pw.println(99999);
			pw.println(9.9999);
			pw.println(false);
			pw.println("hello world");
			pw.println("더글로리");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
