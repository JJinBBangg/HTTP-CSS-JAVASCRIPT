package lecture.p0902anonymous;

public class C06Anonymous {
	public static void main(String[] args) {
		class Sub06 extends MyClass06 {
			@Override
			void method() {
				System.out.println("로컬클래스 재정의1");
			}
		}
		MyClass06 o1 = new Sub06();
		method1(o1);

		MyClass06 o2 = new MyClass06() {
			@Override
			void method() {
				System.out.println("로컬클래스 재정의2");
			}
		};
		method1(o2);
		
		method1(new MyClass06() {
			@Override
			void method() {
				System.out.println("로컬클래스 재정의3");
			}
		});
	}

	public static void method1(MyClass06 param) {
		param.method();
	}
}

abstract class MyClass06 {
	abstract void method();
}
