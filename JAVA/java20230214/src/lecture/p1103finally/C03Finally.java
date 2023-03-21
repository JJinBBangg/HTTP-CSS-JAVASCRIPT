package lecture.p1103finally;

public class C03Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			if (a) {
				return;
			}
		} finally {
			System.out.println("finally block");
		}
	}
}
