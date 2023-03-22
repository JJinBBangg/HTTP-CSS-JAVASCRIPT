package ex.programmers;

import java.util.*;

public class Ex120813 {
	public static void main(String[] args) {
		int n = 5;
		List<Integer> list = new ArrayList<>();
		for (int i = n; i > 0; i--) {
			if (i % 2 != 0) {
				list.add(i);
			}
		}
		List<String> arr = List.of("Ad", "asd", "Asd");
		String[] answer1 = arr.toArray(new String[arr.size()]);
		
//		int[] answer = list.toArray(new Integer[list.size()]);
	}
}
