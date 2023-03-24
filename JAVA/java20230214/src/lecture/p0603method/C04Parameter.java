package lecture.p0603method;

public class C04Parameter {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		o1.method();
//		o1.method(2);  안됨
		
		o1.method2(3);
//		o1.method2(); 안됨
		
		o1.method3("hello");
		String s1 = "java";
		o1.method3(s1);
		
		o1.method4("java", "java");
		
		o1.method5("java", 0);
		
		o1.method6("hello", true);
		
		o1.method7(3.0, 4);
	}
}
