package lecture.p1302wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1= new MyClass03<Number>();
//		o1.itme = new Number(); // ok (추상클래스여서 인스턴스화 못함)
		o1.itme = new Integer(0); // ok
//		o1.itme = new Object();
		
		MyClass03<? super Number> o2= new MyClass03<Object>();
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o5 = new MyClass03<Double>();
		Number n1 = o4.itme;
		Object o6 = o4.itme;
//		Integer i1 = o4.itme; 
		
		
		
	}
}

class MyClass03<T>{
	public T itme;
}