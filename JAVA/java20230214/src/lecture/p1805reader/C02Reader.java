package lecture.p1805reader;

import java.io.*;
import java.util.*;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer1.txt";
		try (var rd = new FileReader(name)) {
			char[] data = new char[6];
			int len;
			while((rd.read(data)) != -1) {
				len = data.length;
				System.out.println(new String(data, 0, len));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
