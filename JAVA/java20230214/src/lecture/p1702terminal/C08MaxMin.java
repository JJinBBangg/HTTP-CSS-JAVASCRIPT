package lecture.p1702terminal;

import java.util.*;

public class C08MaxMin {
	public static void main(String[] args) {
		int[] arr = {3,1,9,0,2,4,5};
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println(max);
		
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
		
	}
}
