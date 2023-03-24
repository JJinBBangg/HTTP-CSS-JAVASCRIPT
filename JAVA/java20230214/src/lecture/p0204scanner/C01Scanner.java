package lecture.p0204scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		String input1 = """ 
				동해물과 백두산이
				마르고 닳도록
				하느님이 보우하사
				우리나라 만세
				""";
		Scanner scanner = new Scanner(input1);
		String line1 = scanner.nextLine();
		System.out.println(line1);
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
		System.out.println(scanner.nextLine());
//		System.out.println(scanner.nextLine()); 다음줄 없으면 오류코드 발생
		
//		String line2 = scanner.nextLine();
//		System.out.println(line2);
//		String line3 = scanner.nextLine();
//		System.out.println(line3);
//		String line4 = scanner.nextLine();
//		System.out.println(line4);
	}
}
