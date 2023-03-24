package lecture.p0504string;

public class C01String {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = str2;
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
	}
}
