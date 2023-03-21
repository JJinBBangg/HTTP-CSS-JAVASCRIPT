package lecture.p1703intermediate;

import java.util.*;

public class C08Map {
	public static void main(String[] args) {
		List<Integer> list = List.of(2, 1, 0, 3, 9);

		System.out.println("0으로 맵핑");
		list.stream()
				.map(s -> 0)
				.forEach(System.out::println);

		System.out.println("*2(짝수)로 맵핑");
		list.stream()
				.map(e -> e * 2)
				.forEach(System.out::println);
	}
}
