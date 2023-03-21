package lecture.p1703intermediate;

import java.util.*;

public class C11Map {
	public static void main(String[] args) {
		List<Book> list = List.of(
				new Book("slamdunk", 3000),
				new Book("avatar", 4000),
				new Book("the glory", 5000),
				new Book("avengers", 2000));

		int sum = list.stream()
				.map(Book::getPrice)
				.reduce(Integer::sum)
				.get();
		System.out.println(sum);
		
		double avg = list.stream()
				.mapToInt(Book::getPrice)
				.average()
				.getAsDouble();
		System.out.println(avg);
	}
}

class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
