package lecture.p0803polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {
		MyInterface06 o1 = method();
	}
	public static MyInterface06 method() {
		return new MyClass06();
	}
}

interface MyInterface06{}
class MyClass06 implements MyInterface06{}
class MyClass07 implements MyInterface06{}
