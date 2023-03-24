package lecture.p0508regex;

import java.util.Arrays;

public class C01RegularExpression {
	public static void main(String[] args) {
		// regular expression
		// 정규식, 정규표현식, 정규식표현
		
		String str = "java,    css,   html,   spring";
		String[] arr1= str.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2= str.split("\s*,\s*");  // \s 공백문자(space)  \\s 공백문자들(space, tab, enter 등)
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3= str.split("\\s*,\\s*");
		System.out.println(Arrays.toString(arr3));
	}
}
