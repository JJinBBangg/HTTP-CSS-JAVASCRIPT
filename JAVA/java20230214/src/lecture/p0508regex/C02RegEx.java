package lecture.p0508regex;

public class C02RegEx {
	public static void main(String[] args) {
		// matches
		// 페턴에 맞으면 true 그렇지 않으면 false
		String str = "java";
		boolean res = str.matches(".*[a-z].*");
		
		// 문자 하나 패턴
		System.out.println("a".matches("a"));
		System.out.println("b".matches("b"));
		System.out.println("c".matches("c"));
		
		
	}
}
