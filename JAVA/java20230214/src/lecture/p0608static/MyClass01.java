package lecture.p0608static;

public class MyClass01 {
	// 필드
	String name; // 인스턴스 필스
 	static String company; // 스태틱(정적) 필드
 	
 	//생성자 : 인스턴스 필드 초기화
 	MyClass01(){
 		name = "son";
 	}
	
 	// static block : 스태틱 필드 초기화(주로)
 	static {
 		company = "samsung";
// 		for(int i = 0; i<3; i++) {
// 			company += "s";
// 		}
 	}
	
}
