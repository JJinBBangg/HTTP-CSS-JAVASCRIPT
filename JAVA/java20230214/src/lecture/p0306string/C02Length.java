package lecture.p0306string;

public class C02Length {
	public static void main(String[] args) {
		// Length
		// 문자열의 길이 확인 할 때 사용하는 메소드
		// return type : int
		
		String str1 = "java";
		String str2 = "spring";
		String str3 = "hello world";
		String str4 = """
				동해물과 백두산이
				마르고 닳도록""";
		
		int len1 = str1.length();
		System.out.println(len1);
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str4.length());
	}
}
