package lecture.p0508regex;

public class C23RegEx {
	public static void main(String[] args) {
		// .
		// \.
		
		String pattern1= ".";
		String pattern2= "\\.";
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
		
		//영문대소문자 여러개 .com 
		
		String pattern3 = "[a-zA-Z]*+\\.com";
		System.out.println("daum.com".matches(pattern3));
		System.out.println("daum.net".matches(pattern3));
		System.out.println("daumcom".matches(pattern3));
	}
}
