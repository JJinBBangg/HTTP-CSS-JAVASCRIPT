package lecture.p0502reference;

public class C03Reference {
	public static void main(String[] args) {
		int a = 3;
		method(a);
		
		System.out.println(a);
	}

	public static void method(int b) {
		System.out.println(b);
		b = 30;
		System.out.println(b);
	}
}
