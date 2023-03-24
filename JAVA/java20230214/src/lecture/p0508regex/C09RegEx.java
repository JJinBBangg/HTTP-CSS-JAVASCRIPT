package lecture.p0508regex;

public class C09RegEx {
	public static void main(String[] args) {
		// character class
		// negation(not)
		
		//숫자가 아니면 일치
		System.out.println("0".matches("[^0-9]"));
		System.out.println("f".matches("[^0-9]"));
		System.out.println("^".matches("[^0-9]"));
		System.out.println(" ".matches("[^0-9]"));
		System.out.println("$".matches("[^0-9]"));
	}
}
