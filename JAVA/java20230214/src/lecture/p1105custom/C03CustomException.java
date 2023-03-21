package lecture.p1105custom;

public class C03CustomException {
	public static void main(String[] args) {
		MyException1 e = new MyException1();
		MyException1 e1 = new MyException1("some message");
		System.out.println(e.getMessage()); // null
		System.out.println(e1.getMessage()); // some message ?
	}
}

class MyException1 extends Exception {
	public MyException1() {
		
	}
	public MyException1(String message) {
		super(message);
	}
}
