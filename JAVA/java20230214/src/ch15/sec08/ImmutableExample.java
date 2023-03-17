package ch15.sec08;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		List<String> immutableList1 = List.of("A", "B", "C");

		Set<String> immutableSet1 = Set.of("A", "B", "C");

		Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		// 수정가능한 리스트로 만들기
		List<String> list2 = new ArrayList<>(immutableList2);
		list2.add("0");
		System.out.println(list2);

		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		Set<String> set2 = new HashSet<>(immutableList2);
		set2.add("0");
		System.out.println(set2);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		Map<Integer, String> map2 = new HashMap<>(immutableMap2);
		map2.put(4,"D");
		System.out.println(map2);

		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);
//		immutableList3.add("2");
		immutableList3.replaceAll(s -> s + s); // 수정은 가능
		System.out.println(immutableList3);
		
		Integer[] arr2 = {3,5,6};
		List<Integer> list4 = Arrays.asList(arr2);
		
	}
}
