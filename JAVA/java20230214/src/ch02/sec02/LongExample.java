package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20;
//		long var3 = 10000000000;  컴파일러는 int 값을 인식 L붙여줘야 long으로 인식
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
