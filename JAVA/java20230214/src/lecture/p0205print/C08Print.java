package lecture.p0205print;

import java.util.Scanner;

public class C08Print {
	// 백준 11021
	public static void main(String[] args) {
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2""";

		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		for (int i = 1; i <= loop; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			int sum = num1 + num2;
			System.out.printf("Case #%d: %d%n", i, sum);
		}
	}
}