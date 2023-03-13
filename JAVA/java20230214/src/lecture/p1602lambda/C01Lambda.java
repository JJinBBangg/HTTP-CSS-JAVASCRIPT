package lecture.p1602lambda;

public class C01Lambda {
	public static void main(String[] args) {
		MyInterface01 o1 = () -> {
			System.out.println("abstract method override");
		};
		o1.method1();

		MyInterface01 o2 = () -> {
			System.out.println("others abstract method override");
		};
		o2.method1();

	}
}
// lambda expression
// 추상메소드가 하나인 interface의 익명 클래스 객체 만드는 코드
// functional interface : 추상메소드가 하나인 interface

//어노테이션으로 검증가능
@FunctionalInterface
interface MyInterface01 { // 추상메소드가 하나이기만 하면 functional interface
	void method1();

	String toString(); // Object에 있는 메소드는 추상메소드 수에 포함하지 않음

	default void method2() {

	}

	static void method3() {

	}
}