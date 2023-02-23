package ex.thisisjava;

import java.util.Scanner;

public class Ex407 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int money = 0;

		while (run) {
			System.out.print("""
					---------------------------------
					1.예금 | 2.출금 | 3.잔고 | 4.종료
					---------------------------------
					선택>""");
			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				System.out.print("예금액>");
				int mo = Integer.parseInt(scanner.nextLine());
				money += mo;
				System.out.println(mo + " 원을 입금했습니다.\n현재잔고 : " + money+"원");
			} else if (strNum.equals("2")) {
				System.out.print("출금액>");
				int mo = Integer.parseInt(scanner.nextLine());	
				money -= mo;
				System.out.println(mo + " 원을 출금했습니다.\n현재잔고 : " + money+"원");
			} else if (strNum.equals("3")) {
				System.out.print("잔고>");
				System.out.println(money+"원");
			} else if (strNum.equals("4")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("""
//				---------------------------------
//				1.예금 | 2.출금 | 3.잔고 | 4.종료
//				---------------------------------
//				선택>""");
//		int a = 0;
//		for (int i = 1; i <= a; i++) {
//			System.out.print("""
//					---------------------------------
//					1.예금 | 2.출금 | 3.잔고 | 4.종료
//					---------------------------------
//					선택>""");
//			a = scanner.nextInt();
//			if(a == 1) {
//				System.out.print("예금액>");
//				continue;
//			} else if( a == 2){
//				
//			}
//		}
//
//	}
//}
