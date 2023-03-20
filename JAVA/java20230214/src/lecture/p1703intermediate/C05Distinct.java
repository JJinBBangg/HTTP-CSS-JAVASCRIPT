package lecture.p1703intermediate;

import java.util.*;
import java.util.stream.*;

public class C05Distinct {
	public static void main(String[] args) {
		// 1~45 중 6개 랜덤추출
		Stream<Integer> stream = Stream.generate(() -> (int) (Math.random()*45)+1);
		stream.distinct().limit(6).forEach(System.out::println);
//		stream.forEach(System.out::println);
		
		Random random = new Random();
		
		Stream.generate(() -> random.nextInt(45)+1)
			.distinct()
			.limit(6)
			.forEach(System.out::println);
	}
}
