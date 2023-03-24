package lecture.p0306string;

public class C08StartsWith {
	public static void main(String[] args) {
		//startsWith
		// 특정 문자열로 시작하는지
		// return type : boolean
		
		String str1 = "spring";
		System.out.println(str1.startsWith("s"));
		System.out.println(str1.startsWith("sp"));
		System.out.println(str1.startsWith("pr"));
		
		// endsWith
		// 특정 문자열로 끝나는지
		// return type : boolean
		System.out.println(str1.endsWith("g"));
		System.out.println(str1.endsWith("ng"));
		System.out.println(str1.endsWith("s"));
	}
}
