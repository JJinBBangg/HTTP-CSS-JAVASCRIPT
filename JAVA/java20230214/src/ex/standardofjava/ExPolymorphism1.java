package ex.standardofjava;

class Product2 {
	int price;
	int bounusPoint;

	Product2() {
	}

	Product2(int price) {
		this.price = price;
		bounusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(200);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(300);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(100);
	}

	public String toString() {
		return "Audio";
	}
}

class buyer2 {
	int money = 1000;
	int bounusPoint = 0;
	Product2[] cart = new Product2[10];
	int i = 0;

	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bounusPoint += p.bounusPoint;
		cart[i++] = p;
		System.out.println(p + "를 구매했습니다.");

	}

	void summary() {
		int sum = 0;
		String itemList = "";
		int i = 0;
		for (i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				break;
			}
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구매한 제품 목록 : " + itemList + "총 " + i + "개");
		System.out.println("제품의 가격 총합 : " + sum + "만원");
		System.out.println("구매 후 남은 금액 : " + money + "만원");
		System.out.println("구매 후 적립된 포인트 : " + bounusPoint + "점");
	}
}

public class ExPolymorphism1 {
	public static void main(String[] args) {
		buyer2 b = new buyer2();

		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}
