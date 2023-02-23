package ex.beakjoon;

import java.util.Scanner;

public class Ex9086 {
	public static void main(String[] args) {
		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB""";
		Scanner sc = new Scanner(input);
		int a = sc.nextInt();
		String str = sc.nextLine();
		for(int i = 0; i < a; i++) {
			str = sc.nextLine();
			String str1 = String.valueOf(str.charAt(0));
			String str2 = String.valueOf(str.charAt(str.length()-1));
			System.out.println(str1+str2);	
			
		}
	}
}
