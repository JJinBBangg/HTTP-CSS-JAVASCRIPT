package lecture.p0405break;

public class C04Continue {
	public static void main(String[] args) {
		boolean res = true;
		for (int i = 0; i < 500; i++) {

			System.out.println("실행코드1");

			if (res) {
				continue;
			}

			System.out.println("실행코드2");
		}
	}
}
