package lecture.p1101exception;

import java.util.*;

public class C04RuntimeException {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		
		list.add("java");
		
		System.out.println(list.get(1));
		
		System.out.println("실행흐름");
	}
}
