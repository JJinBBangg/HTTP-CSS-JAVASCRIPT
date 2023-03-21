package lecture.p1102try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		try {
			
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
