package lecture.p1503set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		// set : 순서없음, 중복안됨
		Set<Integer> set = new HashSet<>();
		
		// add element
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90);
		
		// size 크기 
		int size = set.size();
		System.out.println(size); // 중복을 허용하지 않아서 4개
		
		// remove
		set.remove(3); // 객체
		System.out.println(set); // index가 없어서 넣은 순서대로 나오지 않음.
		
		// 전체 탐색
		System.out.println("향상된 for");
		for(Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("Iterator");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println("forEach");
		
		set.forEach(e -> System.out.println(e));
		set.forEach(System.out::println);
		
	}
}
