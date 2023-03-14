package lecture.p1604type_inference;

import java.util.*;

public class C01TypeInference {
	public static void main(String[] args) {
		// 타입추론
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();

		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		List<List<Integer>> list2 = new ArrayList<>();

		MyInterface01 o1 = (int a, String b) -> b;
		MyInterface01 o2 = (a, b) -> b;
	}
}

interface MyInterface01 {
	String action(int a, String b);
}

class Box<T> {
	private T t;
}