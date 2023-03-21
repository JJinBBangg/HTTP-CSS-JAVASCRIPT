package lecture.p1104throw;

public class C03Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}
