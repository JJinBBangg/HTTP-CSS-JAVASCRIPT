package ex.thisisjava;

import java.util.*;

public class Ex508_1 {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88)
		);
		int sum = 0;
		int num = 0;

		System.out.println(list.size());
		System.out.println(list.get(2).size());
		
		for (List<Integer> arr : list) {
			for (int n : arr) {
				sum += n;
				num++;
			}
		}
		double totalAvg = (double) sum / num;

		System.out.println("인원 : " + num + " 명");
		System.out.println("총합 : " + sum + " 점");
		System.out.println("평균 : " + totalAvg + " 점");
		List<Boolean> candies = new ArrayList<>();
		boolean[] result = new boolean[candies.size()];
	}
}
