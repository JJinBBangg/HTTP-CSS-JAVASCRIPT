package lecture.p1702terminal;

import java.util.*;
import java.util.stream.*;

public class C15Collect {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		Map<Integer, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(x -> x.length()));
		System.out.println(map);
		
		
		Map<Integer, List<String>> map1 = new HashMap<>();
		for (String s : list) {
			Integer key = s.length();
			List<String> val = map1.get(key);
			if (val == null) {
				val = new ArrayList<>();
				map1.put(key, val);
			}
			val.add(s);
		}
		System.out.println(map);
	}
}
