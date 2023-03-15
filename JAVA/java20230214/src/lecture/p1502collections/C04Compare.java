package lecture.p1502collections;

import java.util.*;

public class C04Compare {
	public static void main(String[] args) {
		var list = new ArrayList<Person04>();
		list.add(new Person04("kang", "20230315"));
		list.add(new Person04("seo", "20221203"));
		list.add(new Person04("chae", "20020605"));
		list.add(new Person04("song", "20121203"));
		list.add(new Person04("jung", "20210707"));

		Collections.sort(list);
		
		System.out.println(list);
		
	}
}

class Person04 implements Comparable<Person04> {
	private String name;
	private String birth;

	@Override
	public int compareTo(Person04 o) {
		
		return Integer.valueOf(o.birth) - Integer.valueOf(this.birth);
	}

	public Person04(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Person04 [name=" + name + ", birth=" + birth + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

}
