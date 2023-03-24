package lecture.p0603method;

public class C03Method {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		MyClass03 o2 = new MyClass03();
		
		o1.greeting();
		
		o1.name = "son";
		
		o1.greeting();
		o2.greeting();

		o2.name = "kim";
		
		o1.greeting();
		o2.greeting();
	}
}
