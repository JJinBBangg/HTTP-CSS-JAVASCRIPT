package lecture.p0804etc;

public interface MyInterface05 {
	// public static final field

	// public static method
	static void method1() {
		common();
		System.out.println("method1 code...");
	}

	static void method2() {
		common();
		System.out.println("method2 code...");
	}

	private static void common() {
		System.out.println("공통된 코드");
	}
	// public abstract instance mehtod
	// public default instance method
	// private instance method
}
