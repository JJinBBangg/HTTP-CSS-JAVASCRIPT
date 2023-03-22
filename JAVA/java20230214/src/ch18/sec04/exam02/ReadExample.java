package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (
				Reader reader1 = new FileReader("output/test.txt");
				Reader reader2 = new FileReader("output/test.txt")) {
			
			while (true) {
				int data = reader1.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
			
			System.out.println();		
	
			while (true) {
				char[] data = new char[100];
				int num = reader2.read();
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
