package lecture.p0508regex;

public class C11RegEx {
	public static void main(String[] args) {
		// 010으로 시작하고 - 기호, 숫자 4자리, -기호, 숫자 4자리
		String pat = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		System.out.println("010-8858-4544".matches(pat));
	}
}
