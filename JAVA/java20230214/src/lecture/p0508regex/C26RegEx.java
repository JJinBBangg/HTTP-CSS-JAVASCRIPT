package lecture.p0508regex;

public class C26RegEx {
	public static void main(String[] args) {
		// group
		// ()
		
		String pattern1 = "(\\w\\d){2}";
		System.out.println("w2r2".matches(pattern1));
		System.out.println("c5_2".matches(pattern1));
		
		// 전화번호
		//010 있어도 되고 없어도 되고
		// 숫자 8개
		
		String pattern2 = "(010)?\\d{8}";
		
		System.out.println("01083838382".matches(pattern2));
		System.out.println("83838382".matches(pattern2));
	}
}
