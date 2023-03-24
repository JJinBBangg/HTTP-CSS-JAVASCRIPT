package lecture.p0603method;

public class C01Method {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		
		// 메소드호출 call, invoke, execute
		o1.methodName(0);
		o1.run();
		o1.standUp();
		o1.wakeUp();

		MyClass01 o2 = new MyClass01();
		o2.run();
		o2.standUp();
		o2.wakeUp();
		o2.methodName(0);
	}
}
