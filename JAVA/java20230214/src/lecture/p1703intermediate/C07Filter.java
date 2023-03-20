package lecture.p1703intermediate;

import java.util.*;

public class C07Filter {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 9, -1, 0, 2, -3, -6);

		System.out.println("양수만 추출");
		list.stream()
				.filter(s -> 0 < s)
				.forEach(System.out::println);

		System.out.println("짝수만 추출");
		list.stream()
				.filter(s -> (s % 2) == 0)
				.forEach(System.out::println);
		
		System.out.println("홀수만 추출");
		list.stream()
				.filter(s -> (s % 2) == 1)
				.forEach(System.out::println);
	}
}
