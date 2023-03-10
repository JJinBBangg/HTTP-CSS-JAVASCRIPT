package lecture.p1302wildcard;

public class C02WildCard {
	public static void main(String[] args) {
		// 값이 나갈때 (out) super 
		MyClass02<? super String> o1 = new MyClass02<String>();
		//        String 의 상위 타입
		o1.item = new String(); // String 하위 타입 대입가능
//		String s1 = o1.item; // o1의 타입이 상위타입일 수 있음.
		
		//String s1 = o1.item;  // 스트링 또는 상위(!) 타입
		//String에 할당 불가
		
		// 값이 들어올때 (in) extends 
		MyClass02<? extends String> o2 = new MyClass02<String>();
		//        String 의 하위 타입
//		o2.item = new String(); // String, 그 하위 타입 대일 불가능 
		String s2 = o2.item;
		
	}
}

class MyClass02<T>{
	public T item;
}
