package lecture.p1206annotation;

public class C01Annotation {
	public static void main(String[] args) {

	}
}

@MyAnnotation
class MyClass {
	@MyAnnotation
	String field;

	@MyAnnotation
	public MyClass() {
	}

	@MyAnnotation
	void method1() {
		@MyAnnotation
		int var;
	}

	void method2(@MyAnnotation int param) {

	}
}

@interface MyAnnotation {

}
