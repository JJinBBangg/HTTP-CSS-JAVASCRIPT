package lecture.p1701stream;

import java.util.*;
import java.util.stream.*;

public class C03Stream {
	public static void main(String[] args) {
		//collection -> stream
		List<Integer> list1 = List.of(9,8,7,1,2,3,0);
		Collection<Integer> list2 = List.of(9,8,7,1,2,3,0);
		list2.stream();
		
		Stream<Integer> stream1 = list2.stream();
		long count = stream1.count();
		System.out.println(count);
		
		Stream<Integer> stream2 = list2.stream();
		Optional<Integer> max = stream2.max(Integer::compareTo);
		System.out.println(max);
	}
}
