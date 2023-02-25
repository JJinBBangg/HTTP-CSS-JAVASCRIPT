package ex.programmers;

import java.util.Arrays;

public class Ex120911 {
	public static void main(String[] args) {
		String my_string = "hello world";
		String answer = "";
		String str = my_string.toLowerCase();
//		String[] b = d.split("");
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		for (char c : arr) {
			answer += c;
		}
		System.out.println(answer);
	}
}
