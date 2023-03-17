package lecture.p1702terminal;

import java.util.*;
import java.util.stream.*;

public class C16Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,2,3,2,2,2);
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map);
	}
}
