package lecture.p0902anonymous;

public class C08Anonymous {
	public static void main(String[] args) {
		MyInterface08 o1 = new MyInterface08() {
			@Override
			public void method1() {
				System.out.println("메소드 재정의!");
			}
		};
		o1.method1();
	}
}

interface MyInterface08{
	void method1();
}