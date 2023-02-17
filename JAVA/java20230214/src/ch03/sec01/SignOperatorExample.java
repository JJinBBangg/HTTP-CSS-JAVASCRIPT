package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println(x);

		byte b = 100;
		int y = -b;
		System.out.println(y);
		
		int a = 14;
		double c = a*3.3;
		System.out.println(c);
	}
}