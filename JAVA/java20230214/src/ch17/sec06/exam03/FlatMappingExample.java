package ch17.sec06.exam03;

import java.util.*;

public class FlatMappingExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("this is java");
		list.add("i am a best developer");
		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);

		List<String> list1 = Arrays.asList("10, 20, 30", "40, 50");
		list1.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		})
		.forEach(System.out::println);
		
		
		list1.stream()
				.flatMap(s ->Arrays.stream(s.split(",")))
				.map(s-> s.trim())
				.mapToInt(Integer::parseInt)
				.forEach(System.out::println);

	}
}
