package lecture.p1202wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		Byte b = 3;
		Short s = 6000;
		Integer i = 200000;
		Long l = 2929299L; // integer 에서 객체인 Long타입으로는 자동형변환 안됨
		Float f = 3.14f; // double 에서 객체인 Float타입으로는 자동형변환 안됨
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;
		
		Object o1 = b;
		Object o2 = bool;
		
		Object o3 = true;//(auto boxing, 자동형변환)
		
		
	}
}
