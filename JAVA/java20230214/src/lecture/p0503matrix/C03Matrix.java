package lecture.p0503matrix;

public class C03Matrix {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 4, 5 };
		int[][] mat1 = new int[][] {
				new int[] { 3, 4, 5, 6 },
				new int[] { 10, 11, 12, 13 },
				new int[] { 9, 8, 7, 6 }
		};
		int[] arr2 = { 2, 3, 4, 5 };
		int[][] mat2 = {
				{ 3, 4, 5, 6 },
				{ 10, 11, 12, 13 },
				{ 9, 8, 7, 6 }
		};
		int[][] mat3 = {
				{ 1, 2, 3, 4 },
				{ 10, 20 },
				{ 99, 100, 101 }
		};

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j]);
			}
			System.out.println();
		}
	}
}
