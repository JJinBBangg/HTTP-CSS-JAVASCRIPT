package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws IOException {
		write("문자 반환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	public static void write(String str) throws IOException {
		OutputStream os= new FileOutputStream("output/test.txt");
		Writer writer = new OutputStreamWriter(os);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	public static String read() throws IOException {
		var is = new FileInputStream("output/test.txt");
		Reader reader = new InputStreamReader(is);
		char[] data = new char[3];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}
}
