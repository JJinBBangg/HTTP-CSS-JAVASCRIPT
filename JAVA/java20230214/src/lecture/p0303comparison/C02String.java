package lecture.p0303comparison;

public class C02String {
    public static void main(String[] args) {
		//문자열 같은 지 비교
    	// == 사용하지 말 것!
    	// equals 메소드를 사용
    	
    	String str1 = "java";
    	String str2 = "java";
    	
    	boolean r1 = str1 == str2;
    	System.out.println(r1);
    	
    	String str3 = "ja";
    	String str4 = "va";
    	String str5 = str3 + str4;
    	
    	System.out.println(str1); // "java"
    	System.out.println(str5); // "java"
    	
    	boolean r2 = str1 == str5;  // false
    	System.out.println(r2);
    	
    	boolean r3 = str1.equals(str5); // true
    	System.out.println(r3);
    	
    	//다른지 비교할때에도 != 사용하지 말 것
    	//equals 연산결과 앞 !붙여서 확인
    	
    	boolean r4 = !str1.equals(str5); // true
    	System.out.println(r4);
    	
	}
}
