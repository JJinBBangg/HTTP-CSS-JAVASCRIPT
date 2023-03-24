package lecture.p0901nested;

public class C01NestedClass {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyClass01.Nested01 o2 = o1.new Nested01();
		
	}
}
// 중첩 클래스(nested class)
class MyClass01{
	// 필드
	// 생성자
	// 메소드
	
	// class
	class Nested01{
		// 필드
		// 생성자
		// 메소드
	}
}