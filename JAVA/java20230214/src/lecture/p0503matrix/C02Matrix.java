package lecture.p0503matrix;

public class C02Matrix {
	public static void main(String[] args) {
		int[][] mat = new int[3][4];

		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
		System.out.println(mat[2].length);
		mat[0][0] = 1;
		mat[0][1] = 2;
		mat[0][2] = 3;
		mat[0][3] = 4;
		mat[1][0] = 5;
		mat[1][1] = 6;
		mat[1][2] = 7;
		System.out.println("전체 탐색");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
		System.out.println();
		}
		

	}
}
