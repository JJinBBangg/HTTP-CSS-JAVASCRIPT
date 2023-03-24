package lecture.p0508regex;

public class C10RegEx {
	public static void main(String[] args) {
		// quantifier (수량자)
		
		//숫자 3개인가
		System.out.println("010".matches("[0-9][0-9][0-9]"));
		System.out.println("010".matches("[0-9]{3}"));
		System.out.println("0103".matches("[0-9]{3}"));
		System.out.println("01".matches("[0-9]{3}"));
		System.out.println("ab2".matches("[0-9]{3}"));
	}
}
