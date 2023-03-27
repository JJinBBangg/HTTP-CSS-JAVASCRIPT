package lecture.p1206annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {

	}
}

@MyAnnotation03
class MyClass03 {
	@MyAnnotation02
	String filed;

//	@MyAnnotation03
//	public MyClass03() {
//	}
//
//	@MyAnnotation03
//	void method1() {
//
//	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {

}
