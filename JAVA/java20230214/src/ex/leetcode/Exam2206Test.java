package ex.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exam2206Test {

	@Test
	void test1() {
		Exam2206 o1 = new Exam2206();
		assertTrue(o1.divideArray(new int[] {3, 2, 3, 2, 2, 2}));
	}

	@Test
	void test2() {
		Exam2206 o1 = new Exam2206();
		assertFalse(o1.divideArray(new int[] {1, 2, 3, 4}));
	}

}
