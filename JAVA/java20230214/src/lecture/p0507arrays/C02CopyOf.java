package lecture.p0507arrays;

import java.util.Arrays;

public class C02CopyOf {
	public static void main(String[] args) {
		int[] arr1 = {9,8,1,2,3};
		int[] arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	
	arr1[0] = 1;
	
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	}
}
