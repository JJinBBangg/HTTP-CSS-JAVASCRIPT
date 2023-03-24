package lecture.p0501array;

public class C07Array {
	public static void main(String[] args) {
		int a = 3;
		int b;

		b = a;
		System.out.println(a);
		System.out.println(b);
		a = 5;
		System.out.println(a);
		System.out.println(b);
		
		int[] arr1 = {5,6,7};
		int[] arr2;
		arr2 = arr1;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		arr1[0] = 50;
		
		System.out.println(arr2[1]);
		System.out.println(arr2[0]);
		
	}
}
