package lecture.p0508regex;

public class C03RegEx {
	public static void main(String[] args) {
		String str = "java";
		boolean res = str.matches(".*[a-z].*");
		
		// character class(문자분류)
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("bc".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
	}
}
