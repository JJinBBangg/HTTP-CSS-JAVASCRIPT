package lecture.p0508regex;

public class C08RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[0-9a-zA-Z]"));
		//영문 대, 소문자, 숫자로 이루어진 3글자인가?
		System.out.println("ab2".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("aB2".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("3E2".matches("[0-9a-zA-Z][0-9a-zA-Z][0-9a-zA-Z]"));
		System.out.println("3E2".matches("[0-Z][0-Z][0-Z]")); // 아스키코드 참조
		
	}
}
