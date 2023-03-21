package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 85));
		list.add(new Student("홍길동", 92));
		list.add(new Student("홍길동", 87));

		list.stream()
				.mapToInt(s -> s.getScore())
				.forEach(System.out::println);

		// 최대점수
		int maxSocre = list.stream()
				.mapToInt(s -> s.getScore())
				.max()
				.getAsInt();
		System.out.println("최대점수 : " + maxSocre);

		// 최소점수
		int minSocre = list.stream()
				.mapToInt(s -> s.getScore())
				.min()
				.getAsInt();
		System.out.println("최대점수 : " + minSocre);

		// 총합
		int sum = list.stream()
				.mapToInt(s -> s.getScore())
				.sum();
		System.out.println("총합 : " + sum);

		// 평균
		double avg = list.stream()
				.mapToInt(s -> s.getScore())
				.average()
				.getAsDouble();
		System.out.println("평균 : " + avg);

		// 통계
		IntSummaryStatistics summary = list.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		System.out.println("최대점수 : " + summary.getMax());
		System.out.println("최소점수 : " + summary.getMin());
		System.out.println("총합 : " + summary.getSum());
		System.out.println("평균 : " + summary.getAverage());

	}
}
