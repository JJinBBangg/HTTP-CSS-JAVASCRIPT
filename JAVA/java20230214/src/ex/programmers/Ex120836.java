package ex.programmers;

import java.util.regex.*;

public class Ex120836 {
	public static void main(String[] args) {

		// n이 주어지고 두수의 곱이 n이 될 수 있는지 ?
		int n = 40;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			double a = (double)n / i;
			if (Pattern.matches("[0-9]+.0+", String.valueOf(a))) {
				answer++;
			}
		}
    	System.out.println(answer);
	}
}
