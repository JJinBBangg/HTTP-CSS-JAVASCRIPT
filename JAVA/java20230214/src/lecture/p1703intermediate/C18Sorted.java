package lecture.p1703intermediate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("genesis", 7000),
				new Car("avante", 2500),
				new Car("tesla", 5000),
				new Car("morning", 2000)
				);
		list.stream()
				.sorted()
				.forEach(System.out::println);
		System.out.println();
		list.stream()
		.sorted((a,b)-> a.getName().compareTo(b.getName()))
		.forEach(System.out::println);
		System.out.println();
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}
}

class Car implements Comparable<Car> {
	private String name;
	private int price;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Car o) {
		return this.price - o.price;
	}
}
