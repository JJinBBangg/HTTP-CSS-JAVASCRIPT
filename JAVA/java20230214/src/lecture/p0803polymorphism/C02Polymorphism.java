package lecture.p0803polymorphism;

public class C02Polymorphism {
	public static void main(String[] args) {
		method(new MyClass01());
		method(new MyClass02());
	}
	public static void method(MyInterface01 param) {
		// param의 메소드 실행 가능
	}
}
