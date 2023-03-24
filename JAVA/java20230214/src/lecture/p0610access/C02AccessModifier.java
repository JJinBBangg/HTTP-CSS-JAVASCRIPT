package lecture.p0610access;

import lecture.p0610access.*;

//import lecture.p610access.package1.*;

public class C02AccessModifier {
	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
//		System.out.println(o1.age); // 접근불가 private
		System.out.println(o1.name);
		System.out.println(o1.married);  // 다른 패키지 접근불가(디폴트 필드)
		
		o1.method1();
//		o1.method2(); // 접근불가 private
		o1.method3();  // 다른 패키지 접근불가(디폴트 메소드)
		
	}
}
