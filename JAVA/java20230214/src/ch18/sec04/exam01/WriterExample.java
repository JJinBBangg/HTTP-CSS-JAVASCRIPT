package ch18.sec04.exam01;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		try (Writer wr = new FileWriter("output/test.txt")) {
			char a = 'A';
			wr.write(a);
			char b = 'B';
			wr.write(b);
			
			char[] arr = {'C' ,'D','E'};
			wr.write(arr);
			
			wr.write("FGH");
			
			wr.write(0xD7A3);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
