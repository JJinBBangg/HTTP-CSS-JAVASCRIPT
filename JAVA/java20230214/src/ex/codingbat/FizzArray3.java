package ex.codingbat;

public class FizzArray3 {
	public int bigDiff(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int n : nums) {
			max = (max < n) ? n : max;
			min = (min > n) ? n : min;
		}
		
		return max - min;
	}
	
	public int[] fizzArray3(int start, int end) {
		int[] res = new int[end - start];
		
		for (int i = 0; i < res.length; i++) {
			res[i] = start + i;
		}
		
		return res;
	}

}
