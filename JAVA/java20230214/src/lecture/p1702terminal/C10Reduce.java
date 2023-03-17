package lecture.p1702terminal;

import java.util.*;

public class C10Reduce {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "html", "jsp");
		Integer sum = list.stream()
				.map(e -> e.length())
				.reduce(Integer::sum)
				.get();
		System.out.println(sum);
	}
}
