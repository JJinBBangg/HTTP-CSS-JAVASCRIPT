package lecture.p1504map;

import java.util.*;

import javax.swing.plaf.synth.*;

public class C01Map {
	public static void main(String[] args) {
		// map
		// (key, value) 쌍 entry를 저장
		// key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		// entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		// entry의 수
		int size = map.size();
		System.out.println(size);
		
		map.put("kang", "baseball");
		System.out.println(map.size());
		
		//key값으로 value얻기
		String v1 = map.get("kang");
		String v2 = map.get("serly");
		System.out.println(v1);
		System.out.println(v2);
		
		//entry 지우기
		map.remove("kang");
		System.out.println(map.size());
		
		//전체탐색,
		for(String s : map.keySet()) {
			System.out.println(s); // 키 값
			System.out.println(map.get(s)); // value 값
		}
		
		map.forEach((x, y) -> System.out.println(x+":"+y));
		
		System.out.println("entrySet 메소드");
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		for(Map.Entry<String, String>entry : entrys) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}
		
		
		
		
		
	}
}
