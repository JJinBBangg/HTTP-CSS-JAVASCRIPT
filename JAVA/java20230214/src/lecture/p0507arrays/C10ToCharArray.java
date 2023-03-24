package lecture.p0507arrays;

import java.util.Arrays;

public class C10ToCharArray {
	public static void main(String[] args) {
		// String의 toCharArray
		String str1 = "hello world";
		String[] arr = str1.split("");

		System.out.println(Arrays.toString(arr));
		
		char[] arr1 = str1.toCharArray();
		System.out.println(Arrays.toString(arr1));
	}
}
