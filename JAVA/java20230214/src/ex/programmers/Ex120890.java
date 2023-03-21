package ex.programmers;

public class Ex120890 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 45, 44, 45, 46, 78, 8, 9, 9, 0, 0, 5, 4, 35, 64 };
		int n = 48;
		int answer = 0;
		int j = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (j > (Math.abs(n - array[i]))) {
				answer = array[i];
				j = (Math.abs(n - array[i]));
				if (j == (Math.abs(n - array[i]))) {
					answer = array[i] < array[i - 1] ? array[i] : array[1 - 1];
				}
			}
		}
		System.out.println(answer);
	}
}
