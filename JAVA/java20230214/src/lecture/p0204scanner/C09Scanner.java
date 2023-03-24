package lecture.p0204scanner;

import java.util.Scanner;

public class C09Scanner {
	// 백준 25304
	public static void main(String[] args) {
		String input = """
				260000
				4
				20000 5
				30000 2
				10000 6
				5000 8""";
//		총액 X
//		종류 
//	    가격 
//	    갯수
// 		
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		// 코드 작성
		int total = scanner.nextInt();
		int loof = scanner.nextInt();

		for (int i = 0; i < loof; i++) {
			int price = scanner.nextInt();
			int ea = scanner.nextInt();
			total -= (price * ea);

		}

		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}