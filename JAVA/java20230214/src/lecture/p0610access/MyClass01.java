package lecture.p0610access;

public class MyClass01 {
	//접근베한자(access modifier)
	// public 어디서든지 접근가능
	// private : 작성한 클래스 내에서만 접근가능
	public String name;
	private int age;
	
	public void method1() {
		System.out.println("메소드1");
	}
	
	private void method2() {
		System.out.println("메소드2");
	}
	
	private void method3() {
		System.out.println(age);
	}
	
	private void method4() {
		method1();
		method2();
	}
}
