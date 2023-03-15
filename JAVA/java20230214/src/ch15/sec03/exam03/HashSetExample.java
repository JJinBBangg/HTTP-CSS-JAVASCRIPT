package ch15.sec03.exam03;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				iter.remove();
			}
		}
		System.out.println();
		
		set.remove("JDBC");
		
		for(String element : set) {
			System.out.println(element);
		}
	}
}
