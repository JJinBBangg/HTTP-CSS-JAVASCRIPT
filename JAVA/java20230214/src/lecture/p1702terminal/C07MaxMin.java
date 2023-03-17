package lecture.p1702terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);
		System.out.println(list.stream()
				.max((x, y) -> x - y)
//				.max((Integer::compare)
				.get());
		
		Integer max = list.stream()
				.max(Integer::compare) // (x,y) -> Integer.compare(x,y)
				.get();
		System.out.println(max);
		
		Integer min = list.stream()
				.min(Integer::compareTo) // (x, y) -> x.compareTo(y)
				.get();
		System.out.println(min);
	}
}
