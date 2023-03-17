package lecture.p1507treeset;

import java.util.*;

public class C04Comparable {
	public static void main(String[] args) {
		TreeSet<Movie> set = new TreeSet<>();
		set.add(new Movie("topgun"));
		set.add(new Movie("avengers"));
		set.add(new Movie("slamdunk"));
		set.add(new Movie("avatar"));
		
		System.out.println(set);
	}
}

class Movie implements Comparable<Movie> {
	private String title;

	@Override
	public int compareTo(Movie o) {
		// 현재의 객체와 파라미터를 비교
		// 객체가 파라미터보다 작으면 음수
		// 같으면 0
		// 크면 양수
		return this.title.compareTo(o.title);
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + "]";
	}

	public Movie(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(title, other.title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}