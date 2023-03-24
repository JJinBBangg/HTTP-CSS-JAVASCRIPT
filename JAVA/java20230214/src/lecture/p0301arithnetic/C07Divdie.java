package lecture.p0301arithnetic;

public class C07Divdie {
	public static void main(String[] args) {
		// 실수를 0으로 나누면 무한대 (infinity)
		double a = 0.0;
		double b = 3.0;

		double c = b / a;

		System.out.println(c);

		double d = -3.0;
		System.out.println(d / a);
	
		//실수를 0으로 나눈 나머지 : NaN
		double f = 3.0 % 0.0;
		System.out.println(f);
	
		System.out.println(f + 10);
		
		// 무한대확인
		boolean isInfinite1 = Double.isInfinite(c);
		System.out.println(isInfinite1);
		
		// NaN확인
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1);
		
		boolean isNan2 = Double.isNaN(2.0);
		System.out.println(isNan2);
		
		
		
	}
}
