package lecture.p0603method;

public class MyClass04 {
	void method() {
		System.out.println("파라미터가 없는 메소드");
		
	}
	void method2(int i) {
		System.out.println("인티저 파라미터 1개를 받는 메소드");
	}
	void method3(String param1) {
		System.out.println("스트링 파라미터 1개를 받는 메소드");
	}
	void method4(String param1, String param2) {
		System.out.println("스트링 파라미터 2개를 받는 메소드");
	}
	void method5(String param1, int param2) {
		System.out.println("문자열, 정수 하나씩 받는 메소드");
	}
	void method6(String param1, boolean param2) {
		System.out.println("문자열, boolean 하나씩 받는 메소드");
	}
	void method7(double param1, int param2) {
		System.out.println("실수, 정수 하나씩 받는 메소드");
	}
	
}
