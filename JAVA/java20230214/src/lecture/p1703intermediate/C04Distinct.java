package lecture.p1703intermediate;

import java.util.*;
import java.util.stream.*;

public class C04Distinct {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = stream1.distinct();  // 최종연산 시 실행됨
		
		list.add(2);
		list.add(0);
		
		//최종연산 실행 시 중간연산 한번에 실행됨.
		long count1 = stream2.count();
		System.out.println(count1);
	}
}
