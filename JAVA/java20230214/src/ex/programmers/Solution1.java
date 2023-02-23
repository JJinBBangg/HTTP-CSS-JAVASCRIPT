package ex.programmers;

public class Solution1 {

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		if (true) {
			for (int i = 1; i < 100; i++) {
				if (((numer1 * denom2) + (numer2 * denom1)) % i == 0 && (denom1 * denom2) % i == 0) {
					answer[0] = (numer1 * denom2) + (numer2 * denom1) / i;
					answer[1] = denom1 * denom2 / i;
				} else {
					answer[0] = (numer1 * denom2) + (numer2 * denom1);
					answer[1] = denom1 * denom2;
				}
			}
		}
		return answer;
	}
}
//answer[0] = (numer1 * denom2) + (numer2 * denom1);
//answer[1] = denom1 * denom2;

//			
//		if (denom1 % denom2 == 0 || denom2 % denom1 == 0) {
//			if (denom1 <= denom2) {
//				answer[1] = (denom2);
//				answer[0] = (numer1 * (denom2 / denom1) + numer2);
//
//			} else if (denom1 > denom2) {
//				answer[1] = denom1;
//				answer[0] = numer2 * (denom1 / denom2) + numer1;
//			}
//		} else {
//			
//		}
//		
//			if (answer[0] % i == 0 && answer[1] % i == 0) {
//				answer[0] = answer[0] / i;
//				answer[1] = answer[1] / i;
//			}
//		}
//		return answer;
//	}
//}
////		if(answer[0]<=answer[1] && (answer[1]*answer[0])/(answer[1] % answer[0]) != 0) {
////			int lcm = answer[0] * answer[1] / (answer[1] % answer[0]);
////			answer[1] = answer[1]/lcm;
////			answer[0] = answer[0]/lcm;	
////		} else if(answer[0]>answer[1] && (answer[1]*answer[0])/(answer[1] % answer[0]) != 0) {
////			int lcm = answer[0] * answer[1] / (answer[0] % answer[1]);
////			answer[1] = answer[1]/lcm;
////			answer[0] = answer[0]/lcm;
