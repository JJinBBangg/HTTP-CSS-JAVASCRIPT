package lecture.p0902anonymous;

public class C04Anonymous {
	public static void main(String[] args) {
		//-------------------------------//
		class SubClass04 extends MyClass04{
			@Override
			void method() {
			}
		}
		MyClass04 o1 = new SubClass04();
		//-------------------------------//
		MyClass04 o2 = new MyClass04() {
			@Override
			void method() {
			}
		};
		//-------------------------------//
	}
}

abstract class MyClass04{
	abstract void method();
}
