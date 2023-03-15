package ch15.sec03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("java");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
	}
}
