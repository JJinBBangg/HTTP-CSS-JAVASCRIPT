package lecture.p1202wrapper;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30000; // autoboxing

		int r1 = i1 + 50000; // auto unboxing

		System.out.println(r1);

		Object o1 = 30000; // autoboxing, type conversion
//		intr2 = o1 + 50000;  // xx

		int r3 = (Integer) o1 + 50000;
		
		int r4 = (int) o1 + 50000;
		
		System.out.println(r3);
		System.out.println(r4);

	}
}
