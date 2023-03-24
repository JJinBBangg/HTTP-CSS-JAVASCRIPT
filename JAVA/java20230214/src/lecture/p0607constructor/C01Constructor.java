package lecture.p0607constructor;

public class C01Constructor {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		//인스턴스 만들면 해야하는 일
		o1.name = "son";
		o1.age = 99;
		
		MyClass01 o2 = new MyClass01();
		o2.name = "park";
		o2.age = 88;
		
		o1.descript();
		o2.descript();
		
	}
}
