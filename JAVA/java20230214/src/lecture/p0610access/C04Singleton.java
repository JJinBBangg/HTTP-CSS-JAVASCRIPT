package lecture.p0610access;

public class C04Singleton {
	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();
		MyClass04 o2 = new MyClass04();
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		MyClass05 o3 = MyClass05.getInstance();
		MyClass05 o4 = MyClass05.getInstance();
		
		System.out.println(System.identityHashCode(o3));
		System.out.println(System.identityHashCode(o4));
	}
}
