package ex.programmers;

public class Ex4 {
	public static void main(String[] args) {
		int numer1 = 1;
		int numer2 = 3;
		int denom1 = 1;
		int denom2 = 1;

		int[] answer = {0, 0};
		if (true) {
			for (int i = 1; i < 100; i++) {
				if (((numer1 * denom2) + (numer2 * denom1)) % i == 0 && (denom1 * denom2) % i == 0) {
					answer[0] = (numer1 * denom2) + (numer2 * denom1) / i;
					answer[1] = denom1 * denom2 / i;
					System.out.println(answer[1]+","+answer[2]);
				} else {
					answer[0] = (numer1 * denom2) + (numer2 * denom1);
					answer[1] = denom1 * denom2;
					System.out.println(answer[1]+","+answer[2]);
				}
			}
		}
		
	}
}
