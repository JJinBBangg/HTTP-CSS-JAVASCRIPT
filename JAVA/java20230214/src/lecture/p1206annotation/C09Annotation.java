package lecture.p1206annotation;

public class C09Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass09{
	@MyAnnotation09(val1 = "hi", val2= {"a","b"})
	int f1;
	@MyAnnotation09(val1 = "hi", val2= {"a"})
	int f2;
	@MyAnnotation09(val1 = "hi", val2= "a")
	int f3;
}

@interface MyAnnotation09{
	String val1();
	String[] val2();
}