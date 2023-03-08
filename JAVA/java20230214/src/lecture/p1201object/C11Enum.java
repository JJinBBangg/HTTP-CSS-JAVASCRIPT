package lecture.p1201object;

public class C11Enum {
	public static void main(String[] args) {
		// 각 문자가 객체 단위로 저장되어있음.
		System.out.println(Season.SPRING);  // toString()
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		
		System.out.println();
		
		System.out.println(Season.SPRING.ordinal());  // indexOf()
		System.out.println(Season.SUMMER.ordinal());
		System.out.println(Season.FALL.ordinal());
		System.out.println(Season.WINTER.ordinal());
		
		System.out.println();
		
		System.out.println(Season.SPRING.valueOf("SPRING"));  
		System.out.println(Season.SPRING.valueOf("SUMMER")); 
		System.out.println(Season.SPRING.valueOf("FALL")); 
		System.out.println(Season.SPRING.valueOf("WINTER")); 
		
	}

}

enum Season {
	SPRING, SUMMER, FALL, WINTER;
}
