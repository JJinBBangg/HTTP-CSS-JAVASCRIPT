package lecture.p0202type;

public class C14String {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hi";
//		char c1 = (char) s2; // 참조타입과 기본타입 간 변환안됨
		String s3 = "";
		
		// 참조타입(문자열(String))과 기본타입 간 변형
		// 문자열 -> 기본타입XX xx = XX.parseXX
		
		String str1 = "300";
//		int i1 = str1; // xx
		int i1 = Integer.parseInt(str1);
		
		System.out.println(i1);
		
		String str2 = "9000000000000";
		long l2 = Long.parseLong(str2);
		
		String str3 = "3.14";
		double d3 = Double.parseDouble(str3);
		
		//기본형 타입을 참조타입(문자열(String))으로 변환
		// valueOf 메소드 사용
		
		int i6 = 700;
		String str6 = String.valueOf(i6);
		
		long l7 = 99999999999L;
		String str7 = String.valueOf(l7);
		
		double d8 = 3.14;
		String str8 = String.valueOf(d8);
		
		boolean b9 = true;
		String str9 = String.valueOf(b9);
		
		
	}
}
