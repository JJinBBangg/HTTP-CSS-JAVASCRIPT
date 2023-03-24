package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/test1.db")) {
			while(true) {
				int data = is.read();
				if(data == -1)break;
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
