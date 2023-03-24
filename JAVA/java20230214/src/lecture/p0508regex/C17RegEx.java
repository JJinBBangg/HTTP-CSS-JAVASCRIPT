package lecture.p0508regex;

public class C17RegEx {
	public static void main(String[] args) {
		// 영문 대소문자, $, _, 숫자
		// 단, 숫자가 앞에 오면 안됨
		
		String pattern = "[a-zA-Z$_]+[a-zA-Z0-9$_]*";
		System.out.println("hello".matches(pattern));
		System.out.println("class".matches(pattern));
		System.out.println("$value".matches(pattern));
		System.out.println("_age".matches(pattern));
		System.out.println("int".matches(pattern));
		System.out.println("6hour".matches(pattern));
		System.out.println("#name".matches(pattern));
	}
}
