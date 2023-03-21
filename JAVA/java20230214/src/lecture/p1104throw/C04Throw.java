package lecture.p1104throw;

public class C04Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("continue..");
	}

	public static void method1() throws RuntimeException {
		throw new RuntimeException();
	}
}
