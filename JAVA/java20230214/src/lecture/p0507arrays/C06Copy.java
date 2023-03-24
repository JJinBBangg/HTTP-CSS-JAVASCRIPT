package lecture.p0507arrays;

import java.util.Arrays;

public class C06Copy {
	public static void main(String[] args) {		
		int[][] arr1 = {
				{ 3, 4 }, // 행마다 참조변수로 heap에 별도로 저장됨
				{ 5, 8 }  // 행마다 참조변수로 heap에 별도로 저장됨
		};
		int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
		// Arrays.copyOf 해석
		// arr2에 arr.length 길이 만큼의 배열을 생성하고(int[][] arr2 = new int[2][];)
		// arr1의 int[n][] 
		// n번째 있는 열 : 행값들의 배열을 각각 복사하기 때문에 참조변수의 주소값을 저장 
		
		
		int[][] arr3 = {
				{ 3, 4, 5 },
				{ 9, 8, 7 }
		};
		int[][] arr4 = Arrays.copyOf(arr3, arr3.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		arr3[0][0] = 30;
		System.out.println(arr3[0][0]);
		System.out.println(arr4[0][0]);
	}
}
