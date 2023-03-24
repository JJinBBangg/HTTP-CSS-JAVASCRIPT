package lecture.p0508regex;

public class C07RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[A-z]"));
		System.out.println("a".matches("[a-zA-Z]"));
		System.out.println("a".matches("[a-zA-Z]"));
		System.out.println("A".matches("[a-zA-Z]"));
		
		
		System.out.println("7".matches("[a-zA-Z]"));
		System.out.println("6".matches("[a-zA-Z]"));
		System.out.println("a".matches("[A-z]"));
		System.out.println(":".matches("[0-z]")); // 아스키 코드 순서로 정렬
	}
}
