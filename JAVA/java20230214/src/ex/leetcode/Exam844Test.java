package ex.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Exam844Test {


	@Test
	void test1() {
		Exam844 o1 = new Exam844();
		assertTrue(o1.backspaceCompare("ab#c", "ad#c"));
	}

	@Test
	void test2() {
		Exam844 o1 = new Exam844();
		assertTrue(o1.backspaceCompare("ab##", "c#d#"));
	}

	@Test
	void test3() {
		Exam844 o1 = new Exam844();
		assertFalse(o1.backspaceCompare("a#c", "b"));
	}


}
