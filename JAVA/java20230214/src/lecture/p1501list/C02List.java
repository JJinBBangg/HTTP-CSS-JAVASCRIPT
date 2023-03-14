package lecture.p1501list;

import java.util.*;

import javax.swing.plaf.synth.*;

public class C02List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("java1");
		list.add("java2");
		list.add("java3");
		list.add("java4");
		list.add("java5");
		
		System.out.println("for##############");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("향상된 for @@@@@@");
		for(String i : list) {
			System.out.println(i);
		}
		System.out.println("Iterator &&&&&&&&");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		list.forEach(e ->System.out.println(e));
		
		list.forEach(System.out::println);
		
	}
}
