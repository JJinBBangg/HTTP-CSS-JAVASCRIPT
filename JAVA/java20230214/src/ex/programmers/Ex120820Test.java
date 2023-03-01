package ex.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex120820Test {

	@Test
	void test() {
		Ex120820 o1=new Ex120820();
		int res1 = o1.solution(40);
		
		assertEquals(1983, res1);
		
		int res2 = o1.solution(23);
		
		assertEquals(2000, res2);
	}

}
