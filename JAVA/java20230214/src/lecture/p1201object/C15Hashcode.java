package lecture.p1201object;

public class C15Hashcode {
	public static void main(String[] args) {
		Object o1 = new MyClass15();
		Object o2 = new MyClass15();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
	}
}

class MyClass15 {

}
