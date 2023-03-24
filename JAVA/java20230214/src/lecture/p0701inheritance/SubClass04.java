package lecture.p0701inheritance;

public class SubClass04 extends SuperClass04 {
	
	// SuperClass04 method1 재정의
	@Override
	public void method1() {
		System.out.println("sub method1");
	}
	@Override //어노테이션(annotation)
	public void method2() {
		System.out.println("sub method2");
	}
}
