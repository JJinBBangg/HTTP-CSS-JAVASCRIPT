package lecture.p1702terminal;

import java.text.*;
import java.util.*;
import java.util.stream.*;

public class C12Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 9, 8, 7);
		List<Integer> r = list.stream()
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(r);
		List<Integer> r1 = list.stream().collect(Collectors.toList());
		System.out.println(r1);
	}
}
