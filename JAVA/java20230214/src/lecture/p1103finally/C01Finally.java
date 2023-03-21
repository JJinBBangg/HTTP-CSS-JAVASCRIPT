package lecture.p1103finally;

public class C01Finally {
	public static void main(String[] args) {
		try {
			int a = 0; // 1; 이여도 finally block 은 실행됨.
			int c = 3 / a;
			System.out.println("try block continue...");
		} catch (ArithmeticException e) {
			System.out.println("exception!!");
		} finally {
			//exception 발생유무와 상관없이 항상 실행
			System.out.println("finally block @@@@");
		}

		System.out.println("continue..");
	}
}
