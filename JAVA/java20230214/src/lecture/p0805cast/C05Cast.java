package lecture.p0805cast;

public class C05Cast {
	public static void main(String[] args) {
		MyInterface01 o1 = new MyClass011();
//		o1.method(); // xx
		
		//강제 형변환
		MyClass011 o2 = (MyClass011) o1;
		o2.method();
		
	}
}
