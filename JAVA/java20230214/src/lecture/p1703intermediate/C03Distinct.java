package lecture.p1703intermediate;

import java.util.*;

public class C03Distinct {
	public static void main(String[] args) {
		// distinct 중복제거
		List<Integer> list = List.of(3, 1, 2, 0, 1, 2, 3);

		long count = list.stream()
				.count();
		System.out.println(count);
		
		long count2 = list.stream()
				.distinct()
				.count();
		System.out.println(count2);
	}
}
