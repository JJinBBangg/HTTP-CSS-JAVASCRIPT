package lecture.p1201object;

public class C03ToString {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		System.out.println(o1.toString());
		
		Object o2 = o1;
		System.out.println(o2.toString());
		
		Object o3= new MyClass03();
		
		System.out.println(o3.toString());
		System.out.println(o3.hashCode());
		System.out.println(System.identityHashCode(o3));
		System.out.println(System.identityHashCode(o2));
	}
}

class MyClass03{
	
}