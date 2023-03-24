package lecture.p0507arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {3,5,9,2,1};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 객체생성 하면서 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[0] = 33;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
