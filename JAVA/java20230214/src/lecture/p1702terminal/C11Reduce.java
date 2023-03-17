package lecture.p1702terminal;

import java.util.*;

public class C11Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 5, 1);
		Integer sum = list.stream()
				.reduce(0, Integer::sum);
		System.out.println(sum);

		Integer i = list.stream()
				.reduce(1, (x, y) -> x * y);
		System.out.println(i);

	}
}
