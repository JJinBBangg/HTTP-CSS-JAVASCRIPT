package lecture.p0610access;

public class MyClass02 {
	//필드
	public String name;
	private int age;
	
	//default 접근제한자(package private 접근제한자)
	boolean married;
	public void method1() {
		System.out.println("공개 메소드");
	}
	private void method2() {
		System.out.println("프라이빗 메소드");
	}
	
	//default 접근제한자(package private 접근제한자)
	void method3() {
		System.out.println("디폴트 메소드");
	}
}
