package lecture.p0508regex;

public class C14RegEx {
	public static void main(String[] args) {
		// 1개 이상 {1,}
		// +
		String pattern = "[a-z]{1,}";
		String pattern1 = "[a-z]+";
		
		System.out.println("as".matches(pattern));
		System.out.println("a".matches(pattern));
		System.out.println("A".matches(pattern));
		
		System.out.println("as".matches(pattern1));
		System.out.println("a".matches(pattern1));
		System.out.println("A".matches(pattern1));
	}
}
