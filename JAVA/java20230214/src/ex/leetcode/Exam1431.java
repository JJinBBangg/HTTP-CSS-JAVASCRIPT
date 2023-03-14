package ex.leetcode;

import java.util.*;

public class Exam1431 {
	public static void main(String[] args) {
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i : candies){
            max = Math.max(i, max);
        }
        for(int i : candies){
            if(max < i + extraCandies) {
                result.add(true);
            } else {
            	result.add(false);
            }
        }
	}
}
