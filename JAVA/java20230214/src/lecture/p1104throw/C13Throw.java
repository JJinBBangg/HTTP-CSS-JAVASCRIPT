package lecture.p1104throw;

import java.io.*;

public class C13Throw{
	public static void main(String[] args) throws Exception {
		method2();
	}
	public static void method1() throws Exception {
		method2();
	}
	public static void method2() throws Exception {
		new FileInputStream("");
	}
	public static void method3() throws Exception{
		
	} // 확인해야함	
}
