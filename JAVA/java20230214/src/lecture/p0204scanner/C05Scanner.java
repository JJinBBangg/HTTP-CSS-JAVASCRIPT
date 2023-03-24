package lecture.p0204scanner;

import java.util.Scanner;

public class C05Scanner {
	public static void main(String[] args) {
		String input = """
				13 30
				23
				""";
		Scanner scanner = new Scanner(input);

//		Scanner scanner = new Scanner(System.in);
	
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("x"+"y");
		int z = scanner.nextInt();
		
		int result = x + y;
		System.out.println(result);
	}
}
//현재 시간  x시 y 분
//요리에 걸리는 시간 z 분 
