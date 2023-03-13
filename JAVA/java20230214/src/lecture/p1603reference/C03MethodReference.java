package lecture.p1603reference;

public class C03MethodReference {
	public static void main(String[] args) {
		MyInterface04 o1 = a -> System.out.println(a);
		
		MyClass03 s1 = new MyClass03();
		MyInterface04 o2 = a -> s1.method2(a);
		MyInterface04 o3 = s1::method2;
		
		MyInterface02 o4 = () -> s1.method1();
		MyInterface02 o5 = s1::method1;
		
		MyInterface03 o6 = (a,b) -> s1.method3(a, b);
		MyInterface03 o7 = s1::method3;
		
		MyInterface03 o8 = (a, b) -> s1.method3(a, b);
	}
}

interface MyInterface04 {
	void action(int a);
	
}

class MyClass03 {
	void method1(){
		
	}
	void method2(int a) {
		
	}
	void method3(int a, int b) {
		
	}
}
