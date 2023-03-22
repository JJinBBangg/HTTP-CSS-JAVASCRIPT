package lecture.p1802outputstream;

import java.io.*;

public class C05Close {
	public static void main(String[] args) {
		// var
		String s = "java";
		var s2 = "java";
		
		// try-with-resource 에 var 사용가능
		try (var os = new FileOutputStream("")) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
