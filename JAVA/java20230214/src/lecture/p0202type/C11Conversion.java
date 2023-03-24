package lecture.p0202type;

public class C11Conversion {
	public static void main(String[] args) {
		int i1; // 4byte
		long l1; // 8byte

		i1 = 100;
		l1 = i1; // 작은 값을 큰값에 대입하는 것은 가능

		float f1;
		double d1;
		f1 = 3.14F;
		d1 = f1; // 작은 값을 큰값에 대입하는 것은 가능

		// 정수타입간에 작은 타입 -> 큰타입 : 자동변환
		// 정수에서 실수로 : 자동변환

		int i2;
		double d2;

		i2 = 999999;
		d2 = i2;

		long l2;
		l2 = 9999999999L;
		d2 = l2;

		System.out.println(d2);

		float f2; // 4byte
		f2 = l2;
		System.out.println(f2); // 근사값으로 출력되니 주의!
		
		// 문자(char)에서 정수(int, long)으로 자동 형변환
		char c3 = '가';
		int i3 = c3;  // 2byte -> 4byte
		long l3 = c3; // 2byte -> 8byte
		
		
		
	}
}
