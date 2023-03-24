package lecture.p0202type;

public class C10String {
	public static void main(String[] args) {
		// String (참조타입)
		// 문자열 저장
		
	   String s1 = "hello world";
	   
	   s1 = "h";
	   
	   s1 = "";
	   //문자는 '' 문자열은 ""
	   char c1 = '가';
//	   s1 = c1; // xx 서로 다른 타입
	   
	   String s2 = "i am \"ironman\"";
	   System.out.println(s2);
	   
	   String s3 = "i \\";
	   System.out.println(s3);
	   
	   String s4 = "i am \n ironman.";
	   System.out.println(s4);

	   String s5 = "<h1>\n\thello \n\t<span>world</span>\n</h1>";
	   System.out.println(s5);
	   
	   // text block"""
	   //              내용"""
	   // 첫번째 엔터 무시
	   // 가장 앞쪽 들여쓰기 기준
	   String s6 = """
	   		<h1>
	   			hello
	   			<span>world</span>
   			</h1>
   			""";
	   System.out.println(s6);
	   
	}
}
