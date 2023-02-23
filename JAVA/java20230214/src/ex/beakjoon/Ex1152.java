package ex.beakjoon;

import java.util.Scanner;

public class Ex1152 {
	public static void main(String[] args) {
		String input = "The Curious Case of Benjamin Button";
		Scanner sc = new Scanner(input);
//		Scanner sc = new Scanner(System.in);
		String[] arr =  sc.nextLine().trim().split(" ");
		System.out.println(arr.length);
	}
}
