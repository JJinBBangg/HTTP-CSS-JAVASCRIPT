package lecture.p1703intermediate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {
		IntStream.range(1, 6)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}
}
