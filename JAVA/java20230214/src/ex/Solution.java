package ex;

class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = { 0, 0 };
		if (denom1 % denom2 == 0 || denom2 % denom1 == 0) {
			if (denom1 <= denom2) {
				answer[1] = (denom2);
				answer[0] = (numer1 * (denom2 / denom1) + numer2);

			} else if (denom1 > denom2) {
				answer[1] = denom1;
				answer[0] = numer2 * (denom1 / denom2) + numer1;
			}
		} else {
			answer[1] = denom1 * denom2;
			answer[0] = (numer1 * denom2) + (numer2 * denom1);
		}
		if(answer[0]<=answer[1]) {
			int gcd = answer[0] * answer[1] / (answer[1] % answer[0]);
			answer[1] = gcd/answer[1];
			answer[0] = gcd/answer[0];	
		} else if(answer[0]>answer[1]) {
			int gcd = answer[0] * answer[1] / (answer[0] % answer[1]);
			answer[1] = gcd/answer[1];
			answer[0] = gcd/answer[0];	
		}
		return answer;
	}
}

		
