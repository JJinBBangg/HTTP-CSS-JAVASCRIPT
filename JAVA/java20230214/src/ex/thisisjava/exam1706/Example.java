package ex.thisisjava.exam1706;

import java.util.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("김자바", 26));
		int sum = 0;
		// 평균
		for (Member i : list) {
			sum += i.getAge();
		}
		double avg1 = (double)sum / list.size();
		System.out.println("평균나이 : " + avg1);

		double avg2 = list.stream()
				.mapToInt(s -> s.getAge())
				.average()
				.getAsDouble();
		System.out.println("평균나이 : " + avg2);
	}
}
