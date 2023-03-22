package lecture.p1803inputstream;

import java.io.*;
import java.util.*;

public class C04InputStream {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/output6.txt")) {
			byte[] arr = new byte[5];
			int len = 0;
			while((len = is.read(arr)) !=-1) {
				System.out.println(Arrays.toString(arr));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
