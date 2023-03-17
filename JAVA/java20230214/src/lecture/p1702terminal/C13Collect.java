package lecture.p1702terminal;

import java.util.*;

public class C13Collect {
	public static void main(String[] args) {
		List<Integer> list =List.of(3,2,3,2,2,2);
		Map<Integer, Integer> map1 = list.stream()
			.collect(HashMap::new, (map, e)-> map.compute(e, (k, v)-> v==null ? 1:v), Map::putAll);
	}
}
