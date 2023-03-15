package lecture.p1502collections;

import java.util.*;

public class C04Iterator {
	public static void main(String[] args) {
		// iterator
		// collection 탐색을 위한 객체의 타입
		// hasNext() : 다음 탐색할 원소가 있는지 확인 boolean
		// next() : 다음 원소 리턴
		
		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("scc");
		set.add("spring");
		set.add("jsp");
		set.add("html");
		
		// remove : 특정원소 지우기
		
		// 조건에 따른 원소 지우기
		
		// 향상된 for문 사용시 set이 변경되면
		// exception 발생
		for(String s : set) {
			if(s.length() % 2 == 0) {
				set.remove(s);
			}
		}
		//따라서 지우는 목적으로 탐색한다면 Iterator.remove사용
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String n = iter.next();
			if(n.length() %2 == 0) {
				iter.remove();
			}
		}
		
	}
}
