package lecture.p1102try_catch;

public class C06MutipleException {
	public static void main(String[] args) {
		try {
			int[] a = { 0, 1 };
			
//			ArithmeticException
//			ArrayIndexOutOfBoundsException
			int c = 3 / a[0];
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("continue..");
	}
}
