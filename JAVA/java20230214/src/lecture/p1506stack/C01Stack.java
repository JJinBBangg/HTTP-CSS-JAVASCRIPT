package lecture.p1506stack;

import java.util.*;

import javax.swing.plaf.synth.*;

public class C01Stack {
	public static void main(String[] args) {
		// LIFO(last in first out), 후입선출, Stack
		// 주요 메서드
		// push : 새 아이템 추가
		// pop : 아이템 꺼내기(삭제)
		
		Stack<String> stack = new Stack<>();
		
		stack.push("backho");
		stack.push("chisoo");
		stack.push("taesup");
		stack.push("daeman");
		stack.push("taewoong");
		System.out.println(stack.size());
		
		String s1 = stack.pop();
		System.out.println(s1);	
		System.out.println(stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
	}
}
