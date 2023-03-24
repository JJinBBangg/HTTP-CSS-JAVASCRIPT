package lecture.p0603method;

public class MyClass07 {
	//파라미터 개수, 순서, 타입에 맞게
	//아규먼트 전달해야함
	
	//메소드 오버로딩(overloading)
	//메소드 이름이 같아도 
	//파라미터 개수, 순서, 타입이 다르면
	//다른메소드임
	
	void method(int i) {
		System.out.println("정수 하나 받는 메소드");
	}
	void method(long i) {
		System.out.println("정수 하나 받는 메소드");
	}
	void method(int i, int j) {
		System.out.println("정수 두개 받는 메소드");
	}
	void method(String i, int j) {
		System.out.println("스트링, 정수 하나씩 받는 메소드");
	}
	void method(int i, String str) {
		System.out.println("정수, 스트링 하나씩 받는 메소드");
	}
}
