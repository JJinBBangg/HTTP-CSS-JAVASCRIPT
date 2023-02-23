package ex.ex;

public class ex508 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		int sum = 0;
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				num++;
			}
		}
		double totalAvg = (double) sum / num;

		System.out.println("인원 : " + num + " 명");
		System.out.println("총합 : " + sum + " 점");
		System.out.println("평균 : " + totalAvg + " 점");
	}
}
