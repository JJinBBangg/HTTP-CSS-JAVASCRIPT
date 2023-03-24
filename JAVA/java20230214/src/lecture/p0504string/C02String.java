package lecture.p0504string;

public class C02String {
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = "java";
		String str3 = "java";
		// new 연산자를 빼면 기본형변수와 같이 재사용 참조변수String 만 다름
		
		System.out.println(str2==str3);
		System.out.println(str1==str2);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
	}
}
