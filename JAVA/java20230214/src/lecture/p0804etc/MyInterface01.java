package lecture.p0804etc;

public interface MyInterface01 {
	// public abstract 생략되있음.
	void method1();
	
	// public 생략되있음.
	default void method2() {
		System.out.println("interface 의 default method ");
		System.out.println("body가 있는 메소드");
	}
}
