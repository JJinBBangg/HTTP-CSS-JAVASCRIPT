package lecture.p0508regex;

public class C05RegEx {
	public static void main(String[] args) {
		//character class
		
		System.out.println("a".matches("[abcdefghijklmnopqrstuvwxyz]"));
		System.out.println("a".matches("[a-z]"));
	}
}
