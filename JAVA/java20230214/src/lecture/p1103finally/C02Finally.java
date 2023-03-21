package lecture.p1103finally;

public class C02Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;

			if (a) {
				return ;
			}
			System.out.println("try block..");
		} catch (NullPointerException e) {
			System.out.println("exception block...");
		} finally {
			// 심지어 return 되어도 실행되는 블럭
			System.out.println("finally block");
		}
		System.out.println("continue...");
	}
}
