package ex.ex;

import java.util.Scanner;

public class Ex407 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("""
				---------------------------------
				1.예금 | 2.출금 | 3.잔고 | 4.종료
				---------------------------------
				선택>""");
		int a = 0;
		for (int i = 1; i <= a; i++) {
			System.out.print("""
					---------------------------------
					1.예금 | 2.출금 | 3.잔고 | 4.종료
					---------------------------------
					선택>""");
			a = scanner.nextInt();
			if(a == 1) {
				System.out.print("예금액>");
				continue;
			} else if( a == 2){
				
			}
		}

	}
}
