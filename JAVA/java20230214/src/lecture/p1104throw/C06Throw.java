package lecture.p1104throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {

	}

	public static void method2() throws Throwable {
		int a = 1;
		if(a == 1) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
	
	public static void method1() throws ClassNotFoundException, FileNotFoundException {
		int a = 1;
		if (a == 1) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
}
