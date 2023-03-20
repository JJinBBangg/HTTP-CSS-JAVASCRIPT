package lecture.p1703intermediate;

import java.util.*;
import java.util.stream.*;

public class C02Limit {
	public static void main(String[] args) {
		// limit : 크기제한
		List<String> list = List.of("java", "caa", "html", "spring", "jsp");

		Stream<String> stream1 = list.stream();
		Stream<String> stream2 = stream1.limit(3);

		long count1 = stream2.count();

		System.out.println(count1);

		long count2 = list.stream()
				.limit(3)
				.count();
		System.out.println(count2);
	}
}
