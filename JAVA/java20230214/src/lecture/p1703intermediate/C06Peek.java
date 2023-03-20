package lecture.p1703intermediate;

import java.util.*;
import java.util.stream.*;

public class C06Peek {
	public static void main(String[] args) {
		// peek
		(new Random()).ints(1, 45)
					.limit(6)
					.distinct()
					.forEach(System.out::println);
	}
}
