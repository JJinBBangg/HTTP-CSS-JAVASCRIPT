package lecture.p0403while;

public class C01While {
	public static void main(String[] args) {
		// while
		// 반복문

		// 조건이 true면 코드블럭 실행
		// 코드블럭 실행 후 조건 확인
		// 반복

		System.out.println("이전실행문..");
		boolean con = true;
		while (con) {
			System.out.println("반복실행문1");
			System.out.println("반복실행문2");
		}
		System.out.println("다음실행문..");
	}
}
