package ex.programmers;

import java.util.Arrays;

public class Ex120889 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		int height = 2;
		int answer = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (height < array[i]) {
				answer++;
			}
		}
	}
}
