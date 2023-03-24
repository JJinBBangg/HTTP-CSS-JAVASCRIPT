package lecture.p0804etc;

public interface MyInterface02 {
	
	private void common() {
		System.out.println("공통된 코드들");
	}
	
	default void mehtod1() {
		common();
		System.out.println("메소드1 코드들");
	}

	default void mehtod2() {
		common();
		System.out.println("메소드1 코드들");
	}

}
