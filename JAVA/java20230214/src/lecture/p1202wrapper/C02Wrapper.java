package lecture.p1202wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		
		Integer o1 = new Integer (i1);  // 과거 (포장, boxing)
		Integer o2 = o1; // 현재 (auto boxing)
		Integer o3 = Integer.valueOf(i1); // 지금버전(포장, boxing)(권장) 
		
		Number o4 = i1; // (auto boxing, 자동형변환)
		Object o5 = i1; // (auto boxing, 자동형변환)
		
		
	}
}
