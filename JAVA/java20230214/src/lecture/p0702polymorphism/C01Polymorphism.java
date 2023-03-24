package lecture.p0702polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		SubClass01 o1 = new SubClass01();
		SubClass01 o2 = o1;
		o2.method1();
		o1.method1();
		
	}
}

class SuperClass01 {
	public void method1(){
		System.out.println("Super method1");
	}
}

class SubClass01 extends SuperClass01{
	@Override
	public void method1() {
		System.out.println("Sub method1");
	}
}
