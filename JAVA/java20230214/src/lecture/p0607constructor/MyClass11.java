package lecture.p0607constructor;

public class MyClass11 {
	final String name = "son";
	final int age; // 생성자에서 값 할당해야함
	
	MyClass11(){
		this(99);
	}
	
	MyClass11(int age){
		this.age = age;
	}
}
