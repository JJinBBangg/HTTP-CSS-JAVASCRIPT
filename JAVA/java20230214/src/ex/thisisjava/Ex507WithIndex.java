package ex.thisisjava;

public class Ex507WithIndex {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };

		int max = Integer.MIN_VALUE;
		int indexOfMax = 0; // 인덱스 찾기
		for (int i = 0; i < array.length; i++) {
//			max = array[i] > max ? array[i] : max;
			if(max < array[i]) {
				max = array[i];
				indexOfMax = i;
				
			}
		}
		System.out.println(max);
		System.out.println(indexOfMax);
	}
}
