package ex.egoing;

class Cal1 {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	// overloading
	public int sum(int v1, int v2, int v3) {
		System.out.println("Overloading!");
		return this.sum(v1, v2) + v3;
		//this 는 sum의 기존 자신의 함수를 가져와서 사용(본인의 클래스 인자)
	}
}

class Cal2 extends Cal1 {
	// overriding
//	public int sum(int v1, int v2) {
//		System.out.println("Overriding");
//		return v1+v2;
//	}
	public int sum(int v1, int v2) {
		System.out.println("Overriding");
		return super.sum(v1, v2);
	} // super는 부모클래스 sum함수의 return 값을 반환받음(부모의 클래스 인자)

	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}

public class InheritanceApp01 {
	public static void main(String[] args) {
		Cal1 c = new Cal1();
		System.out.println(c.sum(2, 1));
		System.out.println(c.sum(2, 1, 3));
		Cal2 c2 = new Cal2();
		System.out.println(c2.minus(2, 1));
		System.out.println(c2.sum(2, 1));
	}
}
