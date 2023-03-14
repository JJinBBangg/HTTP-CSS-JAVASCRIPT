package lecture.p1604type_inference;

import java.util.*;

public class C02TypeInference {
//	var field = 3;
	public static void main(String[] args) {
		// 지역변수 타입 추론
		// var 사용
		// field에서 사용불가
		// 선언과 동시에 초기화 할 때만 사용가능
		int a = 3;
		String b = "java";
		
		var c = 5;
		var d = "hello";
		
//		var e;
//		e = 9;
		
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		var Box3 = new Box<String>();
		var list1 = new ArrayList<List<String>>();
		
		// 재할당 시 같은 타입만 가능
		var f = 10;
		f = 11;
//		f = "java"; // 최초로 지정된 타입으로 넣어야함.
		
		// var 사용시 읽기 쉬운코드인가?
		var list2 = new ArrayList<String>();
		for(String item : list2) {
			
		}
		// ..................... //
		// 가까워서 읽기 쉬운지 판단하여 사용
		for(var item : list2) {
			
		}
		
		//var는 키워드가 아님
		int var = 3; // 사용은 가능하나 변수명으로 사용하지 말 것
		
	}
}
