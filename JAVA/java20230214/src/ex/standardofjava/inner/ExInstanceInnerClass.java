package ex.standardofjava.inner;

public class ExInstanceInnerClass {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyClass.InstanceInner ii = mc.new InstanceInner();
		//  MyClass 내에 내부클래스 객체생성 방법
		
		
		System.out.println(ii.iv);
		System.out.println(MyClass.StaticInner.cv);
		System.out.println();
		
		MyClass.StaticInner cc = new MyClass.StaticInner();
		System.out.println(cc.cv);  // 경고문구 정적메소드를 불필요하게 객체생성(메모리낭비)
		System.out.println(cc.iv);
	}
}
