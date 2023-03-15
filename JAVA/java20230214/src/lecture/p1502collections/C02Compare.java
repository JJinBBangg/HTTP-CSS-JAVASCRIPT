package lecture.p1502collections;

import java.util.*;

public class C02Compare {
	public static void main(String[] args) {
		List<Person02> list1 = List.of(
				new Person02("son", 30),
				new Person02("cha", 50),
				new Person02("park", 40));
		List<Person02> list2 = new ArrayList<>(list1);

		// comparator.compare
		// 아래 3개중 하나의 값을 리턴
		// 음수: 첫번째 매개값이 작으면
		// 0 : 두값이 같으면
		// 양수 : 첫번째 매개값이 크면
		Person02 maxAge = Collections.max(list2, (a, b) -> a.getAge() - b.getAge());
		System.out.println(maxAge.getName() + ", " + maxAge.getAge());
		System.out.println(maxAge);

		Person02 minAge = Collections.min(list2, (a, b) -> a.getAge() - b.getAge());
		System.out.println(minAge.getName() + ", " + minAge.getAge());
		System.out.println(minAge);

		System.out.println(list2);
		
		Collections.sort(list2, (x, y) -> x.getAge() - y.getAge());
		System.out.println(list2);
		
		Collections.sort(list2, (x,y) -> x.getName().compareTo(y.getName()));
		System.out.println(list2);
    }
}

class Person02 {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person02 [name=" + name + ", age=" + age + "]";
	}

	public Person02(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
