package lecture.p0204scanner;

import java.util.Scanner;

public class C07Scanner {
	// 백준 2525
	public static void main(String[] args) {
//		String input = """
//				14 30
//				20""";

//		String input = """
//				17 40
//				80""";

		String input = """
				23 48
				25""";

		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int min = scanner.nextInt();
		int pastMin = scanner.nextInt();

		hour = (hour + ((min + pastMin) / 60)) % 24;
		min = (min + pastMin) % 60;
		
		System.out.println(hour+" "+min);
	}
}