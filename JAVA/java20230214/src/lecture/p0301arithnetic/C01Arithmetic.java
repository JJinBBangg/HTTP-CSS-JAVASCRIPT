package lecture.p0301arithnetic;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술연산자
		// +,-,*,/,%

		int i1 = 30;
		int i2 = 50;

		System.out.println(i1 + i2);
		System.out.println(i1 - i2);
		System.out.println(i1 * i2);
		System.out.println(i1 / i2);
		System.out.println(i1 % i2);

		double d1 = 3.14;
		double d2 = 9.9;

		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);

		// 정수와 실수의 산술연산을 하면
		// 결과는 실수로 출력
		int i3 = 10;
		double d3 = 3.0;

		System.out.println(i3 + d3);
		System.out.println(i3 - d3);
		System.out.println(i3 * d3);
		System.out.println(i3 / d3);

		// *, /, %가 +, -보다 우선순위 높음
		int i4 = 5 + 3 / 2;
		int i5 = 5 * 3 + 10;
		int i6 = 9 + 10 % 3;

		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);

		int i7 = 5 + (3 / 2);
		int i8 = (5 * 3) + 10;
		int i9 = 9 + (10 % 3);
		
		System.out.println(i7);
		System.out.println(i8);
		System.out.println(i9);
		
		int i10 = (5 + 3) / 2;
		int i11 = 5 * (3 + 10);
		int i12 = (9 + 10) % 3;
		System.out.printf("%d, %d, %d%n", i10, i11, i12);
		
		
	}
}
