package lecture.p0804etc;

public class MyClass012 implements MyInterface01{
	@Override
	public void method1() {
		System.out.println("class012 override");
	}
	@Override
	public void method2() {
		System.out.println("default method 재정의 가능");
	}
}
