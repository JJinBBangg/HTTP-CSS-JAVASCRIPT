package lecture.p0703cast;

public class C04Instanceof {
	public static void main(String[] args) {
		// instanceof 연산자
		// 연산결과 boolean
		// 왼쪽항 참조변수, 오른쪽항 Type
		// true : 왼쪽항의 참조변수가 가리키는 객체가 오른쪽항의 Type이면
		// false : 아니면

		Sub04 o1 = new Sub04();
		boolean b1 = o1 instanceof Sub04;
		boolean b2 = o1 instanceof Super04;

		System.out.println(b1);
		System.out.println(b2);
		
		Super04 o2 = new Super04();
		boolean b3 = o2 instanceof Super04;
		boolean b4 = o2 instanceof Sub04;
		
		System.out.println(b3);
		System.out.println(b4);
	}
}

class Super04 {
}

class Sub04 extends Super04 {
}
