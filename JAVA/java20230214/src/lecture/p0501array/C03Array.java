package lecture.p0501array;

public class C03Array {
	public static void main(String[] args) {
		// 배열을 만들고 값을 할당
		int[] arr1 = new int[3];
		arr1[0] = 9;
		arr1[1] = 8;
		arr1[2] = 10;

		// 배열 만들 때 초기값 생성
		int[] arr2 = new int[] { 99, 77, 55 };
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		int[] arr3;
		arr3 = new int[] {1, 2, 3};
		
		for(int i= 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
	}
}
