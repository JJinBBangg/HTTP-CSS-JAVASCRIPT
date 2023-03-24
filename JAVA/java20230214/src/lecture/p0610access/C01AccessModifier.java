package lecture.p0610access;

public class C01AccessModifier {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		System.out.println(o1.name);
//		System.out.println(o1.age);  // private 접근불가 
		
		o1.method1(); // 실행가능
//		o1.method2(); // private 접근불가
		
	}
}
