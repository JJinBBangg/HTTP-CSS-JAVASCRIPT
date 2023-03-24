package lecture.p0708super;

public class C04Super {

}

class Super04 {
	public void method1() {

	}
	public void method3() {
		
	}
}

class Sub04 extends Super04 {
	@Override
	public void method3() {
		method1();
		method3(); // 자기 자신
		super.method3(); // 부모
	}
	public void method2() {
		method1();
		
	}
}