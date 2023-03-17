package lecture.p1702terminal;

import java.util.stream.*;

public class C01Terminal {
	public static void main(String[] args) {
		// count : 원소의 수
		// forEach : 각 원소 처리
		// max : 최대값
		// min : 최소값
		
		// findFirst : 첫 원소
		// findAny : 아무원소
		// allMatch : 모든원소가 일치하는지?
		// anyMatch : 하나라도 일치하는지?
		// noneMatch : 일치하는 것이 없는지?
		
		// reduce : 집계 연산
		// collection : 콜렉션으로 만들기
		
		IntStream stream1 = IntStream.range(0, 10);
		System.out.println(stream1.findAny().getAsInt());
		
	}
}
