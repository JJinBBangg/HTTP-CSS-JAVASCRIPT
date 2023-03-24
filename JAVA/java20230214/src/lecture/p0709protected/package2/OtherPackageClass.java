package lecture.p0709protected.package2;

import lecture.p0709protected.package1.*;

public class OtherPackageClass {
	public void someMethod() {
		Super01 o1 = new Super01();
//		o1.method(); // 다른 패키지여서 안됨
	}
}
