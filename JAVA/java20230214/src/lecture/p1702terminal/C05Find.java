package lecture.p1702terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		// findFirst
		// findAny

		// Optional<T>
		Optional<String> o1 = Optional.of("java");
		System.out.println(o1.isPresent());
		System.out.println(o1.isEmpty());
		String s1 = o1.get();
		System.out.println(s1);
		String s2 = o1.orElse("default");
		System.out.println(s2);
		
		System.out.println();
		Optional<String> o2 = Optional.ofNullable(null);
		System.out.println(o2.isPresent());
		System.out.println(o2.isEmpty());
//		String s3 = o2.get();
//		System.out.println(s3);
		String s4 = o2.orElse("default");
		System.out.println(s4);
	}
}
