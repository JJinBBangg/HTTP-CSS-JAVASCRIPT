package lecture.p1507treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3, 1, 20, 3000, 15, 7, 9, 2500, 100));
		
		System.out.println(set);
		
		// first
		System.out.println(set.first());
		
		// last
		System.out.println(set.last());
		
		// lower
		System.out.println(set.lower(50));
		
		//higher
		System.out.println(set.higher(50));
		
		// floor
		System.out.println(set.floor(20));  // 포함 작은 값
		
		// ceiling
		System.out.println(set.ceiling(20)); // 포함 큰 값 
		
		// 거꾸로 정렬된 NavigableSet을 리턴
		System.out.println(set.descendingSet());
		System.out.println(set); // 바뀌지 않음.
		
		
		
	}
}
