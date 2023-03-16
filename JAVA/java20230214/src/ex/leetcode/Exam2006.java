package ex.leetcode;

public class Exam2006 {
	public int countKDifference(int[] nums, int k) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i < j && nums[i] - nums[j] == k) {
					result++;
				}
			}
		}
		return result;
	}
}
