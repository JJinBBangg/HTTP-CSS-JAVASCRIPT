package lecture.p0503matrix;

public class C01Matrix {
	public static void main(String[] args) {
		// 2차원 배열(행렬)
		//

		int[][] arr = new int[3][4];

		System.out.println(arr.length);

		arr[0] = new int[] { 1, 3, 5, 7 };
		arr[1] = new int[] { 2, 4, 8, 10 };
		arr[2] = new int[] { 9, 10, 11, 12 };
		System.out.println();
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][3]);

		System.out.println("전체탐색 for");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
