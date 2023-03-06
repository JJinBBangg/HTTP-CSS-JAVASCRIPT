package ex.thisisjava.exam620;

import java.util.*;

public class Account {
	private String name;
	private String accNum;
	private int money;
	private boolean f;
	Scanner sc = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	Account(String name, String accNum, int money) {
		this.name = name;
		this.accNum = accNum;
		this.money = money;
	}

	// 계좌형식 확인
	public String accNumCheck(String accNum) {
		f = true;
		while (f) {
			if (!accNum.matches("[0-9]{3}-[0-9]{3}")) {
				System.out.println("형식에 맞게 입력하세요. 예) 000-000");
				System.out.print("계좌번호 : ");
				accNum = sc.nextLine();
			} else {
				f = false;
			}
		} return accNum;
	}
}
