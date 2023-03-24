package lecture.p0204scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("키보드로 작성하세요.");
//		scanner.nextLine();
		String line = scanner.nextLine();
		
		System.out.println("입력된 값 출력");
		System.out.println(line);
		
		
	}
}
