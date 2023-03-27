package lecture.p1206annotation;

public class C08Annotation {

}

class MyClass08{
	@MyAnnotation08(100)
	int f1;
	@MyAnnotation08(value = 100)   //  value는 생략가능
	int f2;
	@MyAnnotation08(value = 100, name = "lee")  // 여러 attribute사용 시 value 생략 불가능
	int f3;
	@MyAnnotation08
	int f4;
	
}


@interface MyAnnotation08{
	int value() default 0;
	String name() default "kim";
	int age() default 0;
}
