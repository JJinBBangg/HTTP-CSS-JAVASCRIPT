package lecture.p0804etc;

public class C03StaticField implements MyInterface03 {
	public static void main(String[] args) {
		int a = MyInterface03.I;

		System.out.println(MyInterface03.J * 6);
		System.out.println(MyInterface03.MY_HOME);
	}
}
