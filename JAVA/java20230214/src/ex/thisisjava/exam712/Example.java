package ex.thisisjava.exam712;

import ch06.sec13.exam03.package1.*;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
