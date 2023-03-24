package lecture.p0609package;

import java.util.Scanner;
//import lecture.p609package.MyClass03;  같은 클래스 내에 있어서 생략가능

// import 생략가능
// 1. java.lang 패키지 내 클래스 생략가능
// 2. 같은 패키지의 클래스 생략가능
public class C03Import {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = new String("hello");
		String str2 = "world";
		
		MyClass03 o1 = new MyClass03();
	}
}
