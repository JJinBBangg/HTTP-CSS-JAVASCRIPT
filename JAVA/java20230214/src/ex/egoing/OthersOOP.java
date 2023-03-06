package ex.egoing;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	public void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));

		// instance
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello");
		f1.write(" java");

		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello");
		f2.write(" java");
		f2.close();

		f1.write("!!!");
		f1.close();
	}
}
