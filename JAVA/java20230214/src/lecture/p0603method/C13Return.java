package lecture.p0603method;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();

		int var1 = o1.method();

		System.out.println(var1); // 3

		System.out.println(2 + o1.method()); // 5

		System.out.println(var1 * 3); // 9

		String var3 = o1.method2();

		String var4 = o1.method2() + "java";
		System.out.println(var4);
		
		System.out.println(o1.method2());
		//자동 형변환 가능
		long var5 = o1.method();
	}
}
