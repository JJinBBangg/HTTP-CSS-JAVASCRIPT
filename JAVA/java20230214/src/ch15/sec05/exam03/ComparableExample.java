package ch15.sec05.exam03;

import java.util.*;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>(/* (x,y)->x.age-y.age */);
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		System.out.println(treeSet);
	}
}
