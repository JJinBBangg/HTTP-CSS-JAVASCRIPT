package lecture.p0610access.package1;

public class MyClass02 {
	//필드
	public String name;
	private int age;
	boolean married;
	public void method1() {
		System.out.println("공개 메소드");
	}
	private void method2() {
		System.out.println("프라이빗 메소드");
	}
	void method3() {
		System.out.println("디폴트 메소드");
	}
}
