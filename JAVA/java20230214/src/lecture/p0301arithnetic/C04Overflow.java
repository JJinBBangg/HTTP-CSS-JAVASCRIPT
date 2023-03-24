package lecture.p0301arithnetic;

public class C04Overflow {
	public static void main(String[] args) {
		long a = 15_0000_0000;
		long b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		//overflow : 타입의 최대허용값 벗어남
		long c = a + b;
		System.out.println(c);
		
//		int d = -15_0000_0000;
//		int e = -17_0000_0000;
		long d = -15_0000_0000;
		long e = -17_0000_0000;
		
		long f = d + e;
		System.out.println(f);
	}
}
