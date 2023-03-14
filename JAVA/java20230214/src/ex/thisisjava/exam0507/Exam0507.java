package ex.thisisjava.exam0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
//		int[] array = {1,5,3,8,2};
		List<Integer> list = new ArrayList<>();
		
		List<Integer> list1 = List.of(1, 5, 3, 8, 2); // 수정이 불가능 한 list
		
		//최대값을 구하는 코드
		int max = Integer.MIN_VALUE;
		for(int i  : list1) {
			max = Math.max(i, max);
		}
		System.out.println(max);
		
		List<Integer> candies = List.of(2,3,5,1,3);
		int extraCandies = 3;
        boolean[] result = new boolean[candies.size()];
        max = Integer.MIN_VALUE;
        for(int i : candies){
            max = Math.max(i, max);
        }
        for(int i : candies){
            if(max < i + extraCandies) {
                result[i] = false;
            } else {
                result[i] = true;
            }
        }
        System.out.print(result);
	}
}
