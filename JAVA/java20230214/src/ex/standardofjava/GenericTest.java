package ex.standardofjava;

import java.util.*;

class Tv {}
class audio{}
public class GenericTest {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(); 
		list1.add(new Tv()); // .add(object o) 메서드로 추가해준 new Tv의 객체가 저장된 변수의 타입 object로 저장됨
		Tv t1 = (Tv)list1.get(0); // Object 타입에서 Tv 타입으로 강제 형변환 해줘야함.
		
		
		ArrayList<Tv> list2 = new ArrayList<Tv>();  // Tv
		list2.add(new Tv());  // 지네릭스 사용으로 .add(E e) 메서드로 추가한 new Tv의 객체가 저장된 변수 타입이 Tv로 저장됨
		Tv t2 = list2.get(0);  // 형변환 생략 가능
	}
}
