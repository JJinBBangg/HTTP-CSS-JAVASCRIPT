package lecture.p0501array;

public class C06ArrayLength {
	public static void main(String[] args) {
		// 배열의 길이
		int[] arr1 = { 3, 4, 5, 6, 7};
		
		int len = arr1.length;
		
		for(int i = 0; i < len; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
