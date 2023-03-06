package ex.thisisjava.exam620;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {
		Account[] acc = new Account[100];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.print("""
					------------------------------------------
					1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
					------------------------------------------
					선택>""");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				sc.nextLine();
				System.out.print("계좌번호 : ");
				String accNum = sc.nextLine();
//				acc.accNumCheck(accNum);
//				while (acc.f) {
//					if (!accNum.matches("[0-9]{3}-[0-9]{3}")) {
//						System.out.println("형식에 맞게 입력하세요. 예) 000-000");
//						System.out.print("계좌번호 : ");
//						accNum = sc.nextLine();
//					} else {
//						acc.f = false;
//					}
//				}
				System.out.print("계좌주 : ");
				String name = sc.nextLine();
				System.out.print("초기 입금액 : ");
				int money = Integer.valueOf(sc.nextLine());
				for (int i = 0; i < 100; i++) {
					if ((acc[i] == null)) {
						acc[i] = new Account(name, accNum, money);
						break;
					}
				}

				break;
			case 2:
				System.out.println("""
						--------------------------
						계좌목록
						--------------------------
						계좌번호   계좌주   예금액
						--------------------------""");
				for (int j = 0; j < 100; j++) {
					if (!(acc[j] == null)) {
						System.out.println(
								" " + acc[j].getAccNum() + "   " + acc[j].getName() + "   " + acc[j].getMoney() + "원");
					}
				}
				break;
			case 3:
//				f = true;
				sc.nextLine();
				System.out.print("""
						--------------------------
						예금
						--------------------------
						계좌번호 : """);
				accNum = sc.nextLine();
//				while (f) {
//					if (!accNum.matches("[0-9]{3}-[0-9]{3}")) {
//						System.out.println("형식에 맞게 입력하세요. 예) 000-000");
//						System.out.print("계좌번호 : ");
//						accNum = sc.nextLine();
//					} else {
////						f = false;
//					}
//				}
				System.out.println("예금액 : ");
				int addMoney = Integer.valueOf(sc.nextLine());
				for (int i = 0; i < 100; i++) {
					if (!(acc[i] == null)) {
						if (acc[i].getAccNum().equals(accNum)) {
							acc[i].setMoney(acc[i].getMoney() + addMoney);
							System.out.println("입금완료, 현재잔고" + acc[i].getMoney() + "원");
							break;
						} else if (!(acc[i].getAccNum().equals(accNum)) && acc[i + 1] == null) {
							System.out.println("일치하는 계좌가 없습니다. 계좌번호를 확인하세요.");
						}
					}
				}
				break;
			case 4:
//				f = true;
				sc.nextLine();
				System.out.print("""
						--------------------------
						출금
						--------------------------
						계좌번호 : """);
				accNum = sc.nextLine();
//				while (f) {
//					if (!accNum.matches("[0-9]{3}-[0-9]{3}")) {
//						System.out.println("형식에 맞게 입력하세요. 예) 000-000");
//						System.out.print("계좌번호 : ");
//						accNum = sc.nextLine();
//					} else {
////						f = false;
//					}
//				}
				System.out.println("출금액 : ");
				int minusMoney = Integer.valueOf(sc.nextLine());
				for (int i = 0; i < 100; i++) {
					if (!(acc[i] == null)) {
						if (acc[i].getAccNum().equals(accNum)) {
//							f = true;
//							while (f) {
//								if (acc[i].getMoney() - minusMoney < 0) {
//									System.out.println("잔액이 부족합니다. 현재잔고 : " + acc[i].getMoney() + "원");
//									System.out.print("출금액 : ");
//									minusMoney = Integer.valueOf(sc.nextLine());
//								} else {
//									acc[i].setMoney(acc[i].getMoney() - minusMoney);
//									System.out.println("출금완료, 현재잔고" + acc[i].getMoney() + "원");
//									f = false;
//								}
//							}
						} else if (!(acc[i].getAccNum().equals(accNum)) && acc[i + 1] == null) {
							System.out.println("일치하는 계좌가 없습니다. 계좌번호를 확인하세요.");
						}
					}
				}

				break;
			case 5:
				run = false;
			}
		}
		System.out.println("시스템 종료");
	}
}
