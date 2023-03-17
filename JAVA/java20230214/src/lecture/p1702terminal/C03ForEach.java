package lecture.p1702terminal;

import java.util.*;

public class C03ForEach {
	public static void main(String[] args) {
		List<String> list = List.of("java", "scc", "html", "jsp");
		list.stream()
				.forEach(s -> System.out.println(s));
		list.stream()
				.forEach(s -> System.out.println("원소 : " + s));
	}
}
