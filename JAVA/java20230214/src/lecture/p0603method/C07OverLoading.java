package lecture.p0603method;

class C07OverLoading {
	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method(9);
		o1.method(23423L);
		o1.method(33, 44);
		o1.method(4, "hello");
		o1.method("hello", 9);
	}
}
