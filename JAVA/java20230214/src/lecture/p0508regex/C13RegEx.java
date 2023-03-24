package lecture.p0508regex;

public class C13RegEx {
	public static void main(String[] args) {
		// 3개 이상  : {3,}
		
		String pattern = "[0-9]{2,}";
		System.out.println("123".matches(pattern));
		System.out.println("2123".matches(pattern));
		System.out.println("222123".matches(pattern));
		System.out.println("33".matches(pattern));
		System.out.println("1".matches(pattern));
		System.out.println("121sd3".matches(pattern));
	}
}
