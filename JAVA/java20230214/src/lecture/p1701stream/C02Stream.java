package lecture.p1701stream;

import java.util.*;
import java.util.stream.*;

public class C02Stream {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(9, 8, 7, 1, 2, 3);
		long count = stream1.count();
		System.out.println(count);
		
		Stream<Integer> stream2 = Stream.of(9, 8, 7, 1, 2, 3);
//		Optional<Integer> max = stream2.map(Math.max(Integer::compare));
	}
}
