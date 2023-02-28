package ex.standardofjava.inner;

class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB{
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); // 내부class는 객체 생성없이 접근가능
		}
	}
}


class CCC {
//	BBB b = new BBB(); // 사용불가
}

public class ExInnerClass {
	public static void main(String[] args) {
//		BBB b = new BBB(); // 사용불가
//		b.method();
	}
}
