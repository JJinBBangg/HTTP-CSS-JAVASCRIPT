package lecture.p0205print;

import java.util.Scanner;

public class C06Print {
	// 백준 3003
	public static void main(String[] args) {
		String input = """
				2 1 2 1 2 1
				""";
		
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		int q = scanner.nextInt();
		int r = scanner.nextInt();
		int b = scanner.nextInt();
		int kn = scanner.nextInt();
		int p = scanner.nextInt();
		System.out.printf("%d %d %d %d %d %d", 1-k,	2-q, 2-r, 2-b, 2-kn, 8-p);
	}
}