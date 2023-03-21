package lecture.p1104throw;

public class C10Throw {
	public static void main(String[] args) throws ClassNotFoundException {
//		try {
//			method1();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
		method1();
	}

	public static void method1() throws ClassNotFoundException {
		method2();
	}

	public static void method2() throws ClassNotFoundException {

	}
}
