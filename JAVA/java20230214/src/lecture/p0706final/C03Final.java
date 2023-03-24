package lecture.p0706final;

public class C03Final {

}

class Super03 {
	// final method
	// 하위 클래스에서 Override 할 수없음
	final public void method1() {

	}

	public void method2() {

	}
}

class Sub03 extends Super03{
//	@Override
//	public void method1() {
//		System.out.println("재정의");
//	}
}