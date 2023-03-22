package ex.programmers;

import java.util.*;

public class Ex120813 {
	public static void main(String[] args) {
		int n = 5;
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i]=list.get(i);
		}
		
	}
}
