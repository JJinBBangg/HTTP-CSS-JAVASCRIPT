package ex.thisisjava;

import java.util.Arrays;

public class Ex507 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2};
//		Arrays.sort(array);
//		System.out.println(array[array.length-1]);
//		int answer = 0;
		int answer = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			answer = array[i] > answer ? array[i] : answer;
		}
		System.out.println(answer);
	}
}
