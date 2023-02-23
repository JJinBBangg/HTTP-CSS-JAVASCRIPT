package ex.beakjoon;

//1008
//import java.util.Scanner;
//	public class Main {
//		public static void main(String[] args) {
////		String input = """
////				1 3""";
////		Scanner scanner = new Scanner(input);
//			Scanner scanner = new Scanner(System.in);
//			double A = scanner.nextInt();
//			double B = scanner.nextInt();
//			System.out.println(A / B);
//		}
//	}

//2588
//
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		//String input = """
//		//472
//		//385""";
//		//Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		int numMulti1 = num1 * (num2 % 10);
//		int numMulti2 = num1 * ((num2 % 100) / 10);
//		int numMulti3 = num1 * (num2 / 100);
//
//		System.out.println(numMulti1);
//		System.out.println(numMulti2);
//		System.out.println(numMulti3);
//		System.out.println(num1*num2);
//		
//	}
//}

// 100
import java.util.Scanner;

public class Ex1008 {
	public static void main(String[] args) {
		// String input = """
		// 472
		// 385""";
		// Scanner scanner = new Scanner(input);
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num1 * num2);
	}
}
