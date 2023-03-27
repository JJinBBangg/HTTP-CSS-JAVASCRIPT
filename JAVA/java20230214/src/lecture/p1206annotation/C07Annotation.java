package lecture.p1206annotation;

public class C07Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass07{
	@MyAnnotation07(value = "hello")
	String field1;
	@MyAnnotation07("hello")
	String field2;
	@MyAnnotation07("world")
	String field3;
	
}

@interface MyAnnotation07{
	String value(); // value란 이름의 attribute는 생략하고 값만 입력가능
}