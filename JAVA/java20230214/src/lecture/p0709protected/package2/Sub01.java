package lecture.p0709protected.package2;

import lecture.p0709protected.package1.*;

public class Sub01 extends Super01 {
	public void method2() {
		method1();
		this.method1();
		super.method1();
	}
	
	public void method() {
		Super01 o1 = new Super01();
//		o1.method1(); // 다른패키지여서 안됨  instance 생성시 접근안됨 상속으로만 접근가능
	}

}
