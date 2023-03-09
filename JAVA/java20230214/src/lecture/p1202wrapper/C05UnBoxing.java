package lecture.p1202wrapper;

public class C05UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30;
		
		int i2 = 50;
		
		int i3 = i1 * i2; // 지금버전
		
		int i4 = i1.intValue() * i2; // 이전버전
				
		int i5 = i1.intValue(); // unboxing
		
		int i6 = i1; // auto unboxing
		
	}
}
