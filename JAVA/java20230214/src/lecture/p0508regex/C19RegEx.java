package lecture.p0508regex;

public class C19RegEx {
	public static void main(String[] args) {
		// 빈칸
		// \\s
		
		String pattern1 = "\\s";
		
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1));
		System.out.println("""
									
				""".matches(pattern1));
		System.out.println("\t".matches(pattern1));
		System.out.println("	".matches(pattern1));
		
		String pattern2 = "\s*[a-z]+\s[a-z]+\s[a-z]+\s*";
		System.out.println("hello world java".matches(pattern2));
		System.out.println("hello world".matches(pattern2));
		System.out.println("    hello world java   ".matches(pattern2));
	}
}
