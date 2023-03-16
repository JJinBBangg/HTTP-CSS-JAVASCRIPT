package ex.leetcode;

import java.util.*;

public class Exam844 {
	public boolean backspaceCompare(String s, String t) {
		String result1 = "";
		String result2 = "";
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			String str1 = "" + s.charAt(i);
			if (!str1.equals("#")) {
				stack1.push(str1);
			} else {
				if(!stack1.isEmpty())stack1.pop();
			}
		}		
		for (int i = 0; i < t.length(); i++) {
			String str2 = "" + t.charAt(i);
			if (!str2.equals("#")) {
				stack2.push(str2);
			} else {
				if(!stack2.isEmpty())stack2.pop();
			}
		}
		while (!stack1.isEmpty()) {
			result1 += stack1.pop();
		}
		while (!stack2.isEmpty()) {
			result2 += stack2.pop();
		}

		return result1.equals(result2);
	}
}
