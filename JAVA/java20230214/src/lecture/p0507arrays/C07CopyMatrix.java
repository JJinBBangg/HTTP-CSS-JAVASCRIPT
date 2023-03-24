package lecture.p0507arrays;

import java.util.Arrays;

public class C07CopyMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {
				{5,7,9,10},
				{3,2,1,0}
		};
		int[][] arr2 = new int[arr1.length][];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length); 
		}
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		
		arr2[0][0] = 1;
		
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.toString(arr2[1]));
		
		
	}
}
