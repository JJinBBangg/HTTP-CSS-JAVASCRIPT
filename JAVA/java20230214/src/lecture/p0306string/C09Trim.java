package lecture.p0306string;

public class C09Trim {
	public static void main(String[] args) {
		// Trim
		// 문자의 앞, 뒤 공백 제거
		// return type : String
		
		String str1 = "   my   spring    ";
		System.out.println(str1);
		String str2 = str1.trim();
		System.out.println(str1);
		System.out.println(str2);
	}
}
