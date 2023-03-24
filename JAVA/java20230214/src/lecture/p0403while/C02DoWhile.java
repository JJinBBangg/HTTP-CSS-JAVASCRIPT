package lecture.p0403while;

public class C02DoWhile {
	public static void main(String[] args) {
		// do while
		// 코드블럭 실행 후 조건 확인
		// 조건이 true이면 코드 블럭 실행
		// 반복
		System.out.println("이전 명령문..");
		boolean con = false;
		do {
			System.out.println("반복 명령문1");
			System.out.println("반복 명령문2");
		} while (con);

		System.out.println("다음 명령문..");
	}
}
