package lecture.p1201object;

public class C01Enum {
	public static void main(String[] args) {
		System.out.println(MyClass10.SPRING);
		System.out.println(MyClass10.SUMMER);
		System.out.println(MyClass10.FALL);
		System.out.println(MyClass10.WINTER);
	}
}

class MyClass10 {
	public final static int SPRING = 1;
	public final static int SUMMER = 2;
	public final static int FALL = 3;
	public final static int WINTER = 4;
}
