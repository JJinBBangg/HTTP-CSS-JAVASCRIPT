package lecture.p0401if;

public class C02Else {
	public static void main(String[] args) {
		// else
		// if의 조건이 false일 경우 실행 되는 블럭

		System.out.println("코드실행1");
		if (true) {
			System.out.println("코드실행2");
			System.out.println("코드실행3");
		} else {
			System.out.println("코드실행4");
			System.out.println("코드실행5");
		}
		System.out.println("실행흐름... 이어감.");
		// else 코드블럭의 명령문이 하나면 {}생략가능
		// 하지만 꼭 작성
		if (true) {
			System.out.println("코드실행6");
		} else
			System.out.println("코드실행7");

		System.out.println("실행흐름... 이어감.");
	}
}
