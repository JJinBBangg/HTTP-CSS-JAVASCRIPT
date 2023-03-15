package lecture.p1502collections;

import java.util.*;

public class C01Collections {
	public static void main(String[] args) {
		List<String> list1  = List.of("java", "css", "spring", "jsp", "html" );
//		Collections.sort(list1);
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>(list1);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		String max = Collections.max(list1);
		System.out.println(max);
		
		String min = Collections.min(list1);
		System.out.println(min);
		
		Collections.reverse(list2);
		System.out.println(list2);
		
		Collections.fill(list2, "web");
		System.out.println(list2);
	}
}
