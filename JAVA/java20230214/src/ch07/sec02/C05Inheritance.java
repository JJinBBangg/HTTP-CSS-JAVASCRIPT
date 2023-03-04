package ch07.sec02;

public class C05Inheritance {
	public static void main(String[] args) {
		Sub05 o1 = new Sub05();
		o1.method1();
		
		Sub05 o2 = (Sub05)new SuperSuper05();
		o2.method1();
		o2.method2();
		o2.method3();
		
		SuperSuper05 o3 = new Sub05();
		o3.method1();
		
	}
}
