package ch09.sec03.exam01;

public class A {
	static class B {
	}

	B field1 = new B();

	public A() {
		B b = new B();
	}

	void method1() {
		B b = new B();
	}

	static void method2() {
		B b = new B();
	}
}
