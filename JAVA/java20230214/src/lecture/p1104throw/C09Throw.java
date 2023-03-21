package lecture.p1104throw;

import java.io.*;

public class C09Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
//		try {
//			method1();
//		} catch (ClassNotFoundException|FileNotFoundException e) {
//			e.printStackTrace();
//		} // 다형성에 어긋남 던질때 Throwable타입
		
	}
	public static void method1() throws Throwable{
		boolean a = true;
		if(a) {
			throw new ClassNotFoundException();
		} else {
			throw new FileNotFoundException();
		}
	}
}
