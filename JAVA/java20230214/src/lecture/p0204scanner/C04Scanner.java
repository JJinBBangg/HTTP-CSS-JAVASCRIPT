package lecture.p0204scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50";
		Scanner scanner = new Scanner(input);
		
		int num1 = scanner.nextInt();
		System.out.println(num1);
		int num2= scanner.nextInt();
		System.out.println(num2);
		int num3 = scanner.nextInt();
		System.out.println(num3);
	}
}
