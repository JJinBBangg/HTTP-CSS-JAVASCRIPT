package lecture.p0508regex;

public class C12RegEx {
	public static void main(String[] args) {
		// 수량 3~4 : [0-9]{3,4}   ->   3(이상)~4(이하)글자
		
		String pattern = "a{1,3}";
		System.out.println("a".matches(pattern));
		System.out.println("aa".matches(pattern));
		System.out.println("".matches(pattern));
		System.out.println("aaaa".matches(pattern));
		
	}
}
