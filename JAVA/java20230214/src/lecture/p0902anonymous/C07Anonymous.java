package lecture.p0902anonymous;

public class C07Anonymous{
	MyInterface07 o1 = new MyClass07() {
		@Override
		public void mehtod1() {
			
		}
	};
}
class MyClass07 implements MyInterface07{
	@Override
	public void mehtod1() {
		
	}
}
interface MyInterface07{
	void mehtod1();
}
