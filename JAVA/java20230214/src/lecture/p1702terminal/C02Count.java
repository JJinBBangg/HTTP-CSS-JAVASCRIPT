package lecture.p1702terminal;

import java.util.*;
import java.util.stream.*;

public class C02Count {
	public static void main(String[] args) {
		// count
		IntStream stream1 = IntStream.range(0, 100);

		long count1 = stream1.count();
		System.out.println(count1);

		List<String> list1 = List.of("java", "spring", "css");
		Stream<String> stream2 = list1.stream();
		long count2 = stream2.count();
		System.out.println(count2);

		long count3 = list1.stream().count();
		System.out.println(count3);

		// method chaining
		long count4 = list1.stream()
				.map(s -> s + s)
				.filter(s -> s.startsWith("c"))
				.count();
		System.out.println(count4);

	}
}
