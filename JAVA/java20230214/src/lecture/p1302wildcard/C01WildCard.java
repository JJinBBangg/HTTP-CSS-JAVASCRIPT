package lecture.p1302wildcard;

public class C01WildCard {
	public static void main(String[] args) {
		MyClass01<Object> o1 = new MyClass01<>();
		MyClass01<String> o2 = new MyClass01<>();
		
		o1.item = new Object();
		o2.item = new String();
		
		o1.item = new String();
//		o2.item = new Object(); // xx
		
//		MyClass01<Object> o3 = o2; // xx
//		o3.item = new Object(); //xx 
		
	}
}

class MyClass01<T>{
	public T item;
}