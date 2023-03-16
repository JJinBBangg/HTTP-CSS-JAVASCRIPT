package ex.leetcode;

import java.util.*;

public class Exam1748 {
    public int sumOfUnique(int[] nums) {
    int result=0;
    Map<Integer, Integer> map = new HashMap<>();
	for (int n : nums) {
		if (map.containsKey(n)) {
			int oldvalue = map.get(n);
			map.put(n, oldvalue + 1);
		} else {
			map.put(n, 1);
		}
	}
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		int v = entry.getValue();
		if(v == 1) {
			result = result + entry.getKey();
		}
	}
    	return result;
    }
}
