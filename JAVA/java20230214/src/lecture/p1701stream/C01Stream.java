package lecture.p1701stream;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		// 여러원소(element)를 순차적으로 처리하는
		// 기능(메소드)을 제공하는Class, Interface

		// 스트림 만들기
		Stream<Integer> stream1 = Stream.of(5, 1, 3, 9, 10, 0);

		// 스트림 메소드(연산)
		// 1. 최종연산(terminal operation)
		// - 리턴타입 : Stream이 아님
		// - 최종연산시 중간연산도 같이 실행됨

		// 개수 세기(count)
		long i = stream1.count();
		System.out.println(i);
		stream1.findFirst(); // 최종연산 후에는 재사용 불가

		// 2. 중간연산(intermediate operation)
		// - 리턴타입 : Stream

	}
}
