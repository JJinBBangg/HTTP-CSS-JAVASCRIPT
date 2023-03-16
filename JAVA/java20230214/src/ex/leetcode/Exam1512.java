package ex.leetcode;

import java.util.*;

public class Exam1512 {
	public int numIdenticalPairs(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	for(int i : nums) {
    		list.add(i);
    	}
        int result = 0;
        for(int i = 0; i < list.size(); i++) {
        	for(int j = 0; j <list.size(); j++) {
        		if(list.get(i)==list.get(j) && i < j) {
        			result++;
        		}
        	}
        }
    	return result;
    }
	public static void main(String[] args) {
		Exam1512 e = new Exam1512();
    	int[] nums = {1,2,3,1,1,3};
		System.out.println(e.numIdenticalPairs(nums));
	}
}
