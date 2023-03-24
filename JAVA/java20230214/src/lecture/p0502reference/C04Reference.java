package lecture.p0502reference;

public class C04Reference {
	public static void main(String[] args) {
		int[] arr = {3, 4, 5};
		method(arr);
		System.out.println(arr[0]);
	}
	public static void method(int[] arr2) {
		System.out.println(arr2[0]);
		arr2[0] = 30;
		System.out.println(arr2[0]);
	}
}
