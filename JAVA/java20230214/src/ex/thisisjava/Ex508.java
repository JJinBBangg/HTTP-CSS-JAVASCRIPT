package ex.thisisjava;

public class Ex508 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },  //          for (int[] arr : array) {     각 배열 추출
				{ 83, 92, 96 },  //          for(int n : arr){         추출된 배열의 각 요소를 나열
				{ 78, 83, 93, 87, 88 }//     }   
				//                       }
		};
		int sum = 0;
		int num = 0;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				num++;
//			}
//		}
//		double totalAvg = (double) sum / num;
		//향상된 for문
		for (int[] arr : array) {
			for(int n : arr) {
				sum += n;
				num++;
			}
		}
		double totalAvg = (double) sum / num;

		System.out.println("인원 : " + num + " 명");
		System.out.println("총합 : " + sum + " 점");
		System.out.println("평균 : " + totalAvg + " 점");
	}
}
