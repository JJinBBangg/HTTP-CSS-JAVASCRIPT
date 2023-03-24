package lecture.p0507arrays;

import java.util.Arrays;

public class C09Sort {
	public static void main(String[] args) {
		// sort : 정렬
		int[] arr1 = { 9, 0, 2, 3, 8, -1 };
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		String[] arr2 = {  "가", "라", "나", "b", "a", "3", "1", "A", "B", "D", "C", "java", "apple"};
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		String my_string = "Bcad";
        String answer = "";
        String d = my_string.toLowerCase();
        String[] b = d.split("");
        Arrays.sort(b);
		for(String c : b) {
			answer += c;
	}
		System.out.println(answer);
}
}
