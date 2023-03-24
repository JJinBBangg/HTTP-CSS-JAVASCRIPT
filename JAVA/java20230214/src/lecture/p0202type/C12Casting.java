package lecture.p0202type;

public class C12Casting {
	public static void main(String[] args) {
		//정수끼리
		//큰타입->작은타입 : 강제형변환(casting)
		
		
		int i1; // 3byte
		long l1;  //8byte
		
		l1 = 30;
		i1 = (int)l1; // 오류!
		System.out.println(i1);
		
		l1 = 3333333333L;
		i1 = (int)l1;
		System.out.println(i1);
		
		short s1;
		byte b1;
		
		s1 = 128;
		b1 = (byte)s1;
		System.out.println(b1);
		
		//실수 -> 정수 : 강제형변환(casting)
		double d2;
		int i2;
		
		d2 = 3.14;
		i2 = (int)d2; //강제 형변환 -> 소숫점아래 숫자를 제거하기 위해 종종사용
		System.out.println(i2);
	
	
	}
}
