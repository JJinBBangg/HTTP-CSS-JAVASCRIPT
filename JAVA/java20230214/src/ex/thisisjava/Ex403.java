package ex.thisisjava;

public class Ex403 {
	public static void main(String[] args) {
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
			}
		}
		System.out.println(sum3);

	}
}
