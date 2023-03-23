package lecture.p1806buffered;

import java.io.*;

public class C05BufferedWriter {
	public static void main(String[] args) {
		String name = "output/buffered6.txt";
		try (
				FileWriter fw = new FileWriter(name);
				BufferedWriter bw = new BufferedWriter(fw)) {
			for (int i = 0; i < 10; i++) {
				bw.write("hellow world");
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
