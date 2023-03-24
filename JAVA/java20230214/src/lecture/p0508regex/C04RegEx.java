package lecture.p0508regex;

public class C04RegEx {
	public static void main(String[] args) {
		String str = "java";
		boolean res = str.matches(".*[a-z].*");
		
		System.out.println("ab".matches("ab"));
		System.out.println("bc".matches("bc"));
		
		System.out.println("bc".matches("[abc][abc]"));
		System.out.println("aa".matches("[abc][abc]"));
		System.out.println("ac".matches("[abc][abc]"));
		System.out.println("bc".matches("[abc][abc]"));
		System.out.println("cc".matches("[abc][abc]"));
		
	}
}
