package lecture.p1702terminal;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(9, 1, 2, 3, 5);

		int i = list.stream().reduce((x, y) -> x += y).get();
		Integer sum = list.stream().reduce(Integer::sum).get();
		System.out.println(sum);
		System.out.println(i);
		
		Integer max = list.stream().reduce(Integer::max).get();
		System.out.println(max);
	}
}
