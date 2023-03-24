package lecture.p0607constructor;

public class MyClass03 {
	String name;
	int age;
	
	MyClass03(){
		name = "son";
		age = 77;
	}
	
	void descript() {
		System.out.println("이름: "+ name+ ", 나이: "+age);
	}
}
