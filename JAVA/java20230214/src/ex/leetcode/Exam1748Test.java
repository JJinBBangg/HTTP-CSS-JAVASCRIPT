package ex.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exam1748Test {

	@Test
	void test1() {
		Exam1748 o1 = new Exam1748();
		assertEquals(4, o1.sumOfUnique(new int[] {1, 2, 3, 2}));
	}


	@Test
	void test2() {
		Exam1748 o1 = new Exam1748();
		assertEquals(0, o1.sumOfUnique(new int[] {1, 1, 1, 1}));
	}

}
