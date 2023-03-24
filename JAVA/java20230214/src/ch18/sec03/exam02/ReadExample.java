package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/test2.db")) {
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				System.out.println(num);
				if(num == -1) break;
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
