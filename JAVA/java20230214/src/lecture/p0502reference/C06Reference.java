package lecture.p0502reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6};
		
		method(arr);
		
		System.out.println(arr);
		
		System.out.println(arr[0]);
	}
	public static void method(int[] arr) {
		arr= new int[] {3, 5, 7};
		System.out.println(arr);
	}
}
