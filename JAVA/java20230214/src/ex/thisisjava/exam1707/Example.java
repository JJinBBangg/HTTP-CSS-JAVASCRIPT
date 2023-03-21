package ex.thisisjava.exam1707;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동", "개발자"), new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		List<Member> developers = list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.collect(Collectors.toList());

		list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.map(Member::getName)
				.forEach(System.out::println);

		developers.stream().forEach(System.out::println);
	}
}
