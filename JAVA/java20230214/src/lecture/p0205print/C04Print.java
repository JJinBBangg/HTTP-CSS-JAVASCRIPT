package lecture.p0205print;

public class C04Print {
	public static void main(String[] args) {
		//argument는 순서대로 적용됨                       
		// %[argumemt_index$] [flags] [width] [.precision] conversion
		// %<============================================> 생략가능
		System.out.printf("%d, %d%n", 3, 4);
		
		System.out.printf("%d, %f%n", 3, 3.14);
		System.out.printf("%f, %d, %s%n", 3.14, 3, "hello");
		
	}
}
