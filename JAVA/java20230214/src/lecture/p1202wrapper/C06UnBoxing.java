package lecture.p1202wrapper;

public class C06UnBoxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		Integer o1 = i1;
		Integer o2 = i2;
		
		System.out.println(o1 == o2); // 참조타입은 equals 사용 
		
		int i3 = o1;
		int i4 = o2;
		
		System.out.println(i3 == i4); // 기본형은 == 연산사용
	}
}
