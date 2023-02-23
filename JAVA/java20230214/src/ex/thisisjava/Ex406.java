package ex.thisisjava;

import java.util.Scanner;

public class Ex406 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		String res = "";
		for(int i = 1; i <=j; i++) {
			
			res += "*";
			System.out.println(res);
		}
	}
}
