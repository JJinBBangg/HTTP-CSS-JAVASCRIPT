package ex.leetcode;

import java.util.*;

public class Exam2206 {
	public boolean divideArray(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			if (map.containsKey(n)) {
				int oldvalue = map.get(n);
				map.put(n, oldvalue + 1);

			} else {
				map.put(n, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int v = entry.getValue();
			if (v % 2 == 1) {
				return false;
			}
		}

		return true;
//		return map
//				.values()
//				.stream()
//				.allMatch(v -> v % 2 == 1);
	}
}
