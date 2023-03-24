package lecture.p0306string;

public class C06ToLowerCase {
	public static void main(String[] args) {
		// toLowerCase
		// 문자열을 소문자로 바꾼 문자열 리턴
		// return type : String

		String str1 = "I am IronMan.";
		System.out.println(str1.toLowerCase());
		
		// toUppperCase
		// 문자열을 대문자로 바꾼 문자열 리턴
		// return type : String
		
		System.out.println(str1.toUpperCase());
		
		//대소문자 구분없이 문자열 위치 확인 
		String res3= str1.toLowerCase();
		System.out.println(res3.indexOf("ir"));
		System.out.println(str1.toLowerCase().indexOf("ir"));
		
		//대소문자 구분 없이 특정 문자열이 있는 지 확인
		String str4 = "lorem ipSum";
		System.out.println(str4.toLowerCase().contains("sum"));
		System.out.println(str4.toLowerCase().contains("m i"));
		System.out.println(str4.toUpperCase().contains("M I"));
	}
}
