package ex.thisisjava;

import java.util.Arrays;

public class Ex507 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2};
//		Arrays.sort(array);
//		System.out.println(array[array.length-1]);
		int result = Integer.MAX_VALUE;
		for(int i : array) {
			result = Math.max(result, i);
		}
		System.out.println(result);
//		int answer = 0;
//		int answer = Integer.MIN_VALUE;
//		for(int i = 0; i < array.length; i++) {
//			answer = array[i] > answer ? array[i] : answer;
//		}
//		System.out.println(answer);
//
//		int indexOfMax = 0; // 인덱스 찾기;;
//		for(int res : array) {
//			if(answer < res) {
//				answer = res;
////				indexOfMax = i; // 향상된 포문에서 사용불가
//			}
//		}
//		System.out.println(answer);
		
	}
}
