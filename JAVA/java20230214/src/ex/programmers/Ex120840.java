package ex.programmers;

public class Ex120840 {
	public static void main(String[] args) {
		int balls = 12;
		int share = 4;
		int sum1 = 1;
		int sum2 = 1;
		int sum3 = 1;
		
		for (int s = 1; s <= balls-(balls-share); s++) {
			sum1 *= s;
		}
		for (int s = 1; s <= balls-share; s++) {
			sum2 *= s;
		}
		for (int s = 1; s <= share; s++) {
			sum3 *= s;
		}
		
		
	}
}
