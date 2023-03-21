package ex.programmers;

import java.util.*;
import java.util.Map.*;

public class Ex120812 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 4 };
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}
		int i = 0;

		Set<Entry<Integer, Integer>> entrys = map.entrySet();
		for (Entry<Integer, Integer> entry : entrys) {
			if (i < entry.getValue()) {
				answer = entry.getKey();
				i = entry.getValue();
			} else if(i == entry.getValue()) {
				answer = -1;
			}
		}
		System.out.println(answer);

	}
}
