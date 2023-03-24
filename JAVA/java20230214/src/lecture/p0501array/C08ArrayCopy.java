package lecture.p0501array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5};
//		arr1[3] = 9; //  정해진 index안에서 사용
//		System.out.println(arr1[3]);
		
		int[] arr2 = {10, 20, 30};
		int[] arr3 = new int[arr2.length];
		
		for(int i = 0; i < arr2.length; i++) {
			arr3[i]= arr2[i];
		}
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
	
		arr2[0] = 100;
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
	}
}
