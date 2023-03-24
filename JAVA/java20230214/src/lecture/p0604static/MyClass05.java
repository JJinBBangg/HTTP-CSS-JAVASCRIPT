package lecture.p0604static;

public class MyClass05 {
	String name;
	
	static String model;
	
	void printName() {
		System.out.println(name);
		System.out.println(model);  // 클레스 맴버 사용가능
	}
	
	static void printModel() {
		System.out.println(model);
//		System.out.println(name); // 인스턴스 멤버 사용불가
		MyClass05 o1 = new MyClass05();
		System.out.println(o1.name);
	}
}
