package lecture.p1501list;

import java.util.*;

import javax.swing.plaf.synth.*;

public class C03List {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		
		
		// List 의 List
		List<List<String>> list2 = new ArrayList<>();
		var list3 = new ArrayList<List<String>>();
		
		list2.add(new ArrayList<>());
		list2.add(new ArrayList<>());
		
		System.out.println(list2.get(0).size());
		System.out.println(list2.get(1).size());
		
		list2.get(0).add("java");
		list2.get(0).add("spring");
		
		list2.get(1).add("css");
		list2.get(1).add("html");
		list2.get(1).add("js");
		
		// 전체 탐색
		// for
		for(int i = 0; i < list2.size(); i++) {
			for(int j = 0; j < list2.get(i).size(); j++) {
				System.out.println(list2.get(i).get(j));
			}
		}
		
		// 향상된 for
		for(List<String> list : list2) {
			for(String s : list) {
				System.out.println(s);
			}
		}
		
		//forEach
		list2.forEach(list -> list.forEach(e -> System.out.println(e)));
		
		//forEach
		list2.forEach(list -> list.forEach(System.out::println));
		
		
		
	}
}
