package lecture.p1201object;

import java.util.*;

public class C02Object {
	public static void main(String[] args) {
		// Object에 있는 메소드는 모든 클래스가 가지고있다.
		String s = "java";
		s.hashCode();
		s.toString();
		s.equals(s);
		
		Scanner sc = new Scanner("");
		sc.hashCode();
		sc.toString();
		sc.equals(sc);
	
		MyClass02 o1 = new MyClass02();
		o1.hashCode();
		o1.toString();
		o1.equals(null);
	}
}

class MyClass02{
	
}
