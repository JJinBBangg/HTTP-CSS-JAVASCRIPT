package lecture.p1601anonymous;

public class C02Lambda {
	public static void main(String[] args) {
		MyInterface01 o1 = () -> System.out.println("재정의한 메소드 ");
		o1.method1();
	}
}

interface MyInterface02 {
	void method1();
}
