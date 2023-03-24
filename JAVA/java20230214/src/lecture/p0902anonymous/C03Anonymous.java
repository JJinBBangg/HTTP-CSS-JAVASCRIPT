package lecture.p0902anonymous;

public class C03Anonymous {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03() {
			@Override
			void method1() {
				System.out.println("상속받은 클래스 abstract method Override");
			}
		};  // Local Class
		
		o1.method1();
	}
}

abstract class MyClass03{
	abstract void method1();
}
