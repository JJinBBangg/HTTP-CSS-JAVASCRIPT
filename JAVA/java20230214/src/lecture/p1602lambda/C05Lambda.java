package lecture.p1602lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyInterface05() {
			@Override
			public int method() {
				return 0;
			}
		};
		int i1 = o1.method();
		
		MyInterface05 o2 = () -> {
			System.out.println("람다로 메소드 재정의");
			return 3;
		};
		int i2 = o2.method();
		
		MyInterface05 o3 = () -> {
			return 3;
		};
		int i3 = o3.method();
		
		MyInterface05 o4 = () -> 3;
		int i4 = o4.method();
	}
}

class MyClass05 implements MyInterface05{
	@Override
	public int method() {
		System.out.println("명령문 작성");
		return 0;
	}
}
interface MyInterface05{
	int method();
}