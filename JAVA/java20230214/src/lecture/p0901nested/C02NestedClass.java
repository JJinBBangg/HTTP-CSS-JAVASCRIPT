package lecture.p0901nested;

public class C02NestedClass {
	public static void main(String[] args) {
		
	}
}

class MyClass02 {
	class Nested02{
		
	}
	Nested02 item = new Nested02();
	void method1() {
		Nested02 local = new Nested02();
	}
}

