package lecture.p0611capsule;

public class C01Encapsulation {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
//		o1.age = 3;
//		o1.age = -3;
		o1.setAge(3);
		o1.desc();
		o1.setAge(-3);
		o1.desc();
		
	}
}
