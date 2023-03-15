package ch15.sec04.exam01;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();

		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String k = keyIter.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println();
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
		while (entryIter.hasNext()) {
			Map.Entry<String, Integer> entry = entryIter.next();
			String s = entry.getKey();
			Integer i = entry.getValue();
			System.out.println(s + ":" + i);
		}
		System.out.println();
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+ map.size());
		System.out.println();
	}
}
