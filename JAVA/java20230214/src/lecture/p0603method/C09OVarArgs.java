package lecture.p0603method;

public class C09OVarArgs {
	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();
		o1.method1();
		o1.method1(3);
		o1.method1(5, 7);

		o1.method2(new int[] {});
		o1.method2(new int[] { 3 });
		o1.method2(new int[] { 5, 7 });
		o1.method2(new int[] { 100, 200, 300 });

		o1.method3();
		o1.method3(5);
		o1.method3(100, 200);
		o1.method3(99, 88, 77, 66, 55);
		o1.method3(new int[] { 0, 4, 5, 6 });

	}
}
