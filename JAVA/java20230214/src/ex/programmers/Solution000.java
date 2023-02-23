package ex.programmers;

import java.util.Arrays;

//import java.util.Scanner;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
//        Arrays.sort(numbers);
//        int max1 = numbers[numbers.length-1];
//        int max2 = numbers[numbers.length-2];
//        answer = max1*max2;
//        return answer;
        //중복이 없는 정수 중 가장 큰수와 두번째 큰수 곱공식
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max1){
                max1 = numbers[i];        
            } 
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max2 && numbers[i] < max1) {
                max2 = numbers[i];
            } 
        }
        answer = max1*max2;
        return answer;
    }
}

public class Solution000 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] n = {0,343,343,234,1};
		System.out.println(s.solution(n));
		System.out.println(343*343);
		
	}
}

//		String my_string = "jaron";
//        String answer = "";
//        for(int i = my_string.length()-1; i>=0; i--){
//           answer += my_string.charAt(i);
//        }
//        System.out.println(answer);
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력>");
//		int n = scanner.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		문제1
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력>");
//		int n = scanner.nextInt();
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		문제2
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력>");
//		int n = scanner.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		문제3
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("입력>");
//		int n = scanner.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = i; j >= 0; j--) {
//					System.out.print(j);
//			}
//			System.out.println();
//		}

