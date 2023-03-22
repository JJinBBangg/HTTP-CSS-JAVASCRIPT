package ex.thisisjava;

public class Ex120875 {
	public static void main(String[] args) {
		int[][] dots = { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 1, 6 } };
		int answer = 0;
		int r;
		for (int i = 0; i < 4; i++) {
			int y = i+1;
			for (int j = y; j <= 3; j++) {
				if (dots[0][0] == dots[j][0]) {
					answer ++;
				}
			}

		}
		System.out.println(answer);
	}
}
