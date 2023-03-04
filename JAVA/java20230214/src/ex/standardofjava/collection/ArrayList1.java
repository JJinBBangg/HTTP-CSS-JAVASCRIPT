package ex.standardofjava.collection;

import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		// 기본 길이(용량,capacity)가 10 인 ArrayList 생성
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list1+"   "+list2);
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1 +"   "+list2);
		
	}
}

