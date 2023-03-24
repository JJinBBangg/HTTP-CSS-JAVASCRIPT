package lecture.p0603method;

public class C06Parameter {
	public static void main(String[] args) {
		// 자동 형변환
		int a = 3;
		long b = a;
		double c = b;
		MyClass06 o1 = new MyClass06();
		o1.method1(33);
		o1.method1('c'); // char타입 integer타입자동 형변환
		
		o1.method2(234234234234L);
		o1.method2(234234234);
		o1.method2('s');
		
		o1.method3(3.14);
		o1.method3(120312039809L);
		o1.method3(12);
		
		o1.method4(3.14f);
		o1.method4(298342L);
		o1.method4(99);
//		o1.method4(3.14);  flaot 자동형변환 불가
	}
}
