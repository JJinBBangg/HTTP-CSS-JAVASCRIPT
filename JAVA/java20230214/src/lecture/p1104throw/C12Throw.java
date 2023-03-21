package lecture.p1104throw;

import java.io.*;

public class C12Throw {
	public static void main(String[] args) throws Exception {
		method1();  // 또 던짐
		
		try {  // 잡음
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception {
		new FileInputStream("");
	}
	
}
