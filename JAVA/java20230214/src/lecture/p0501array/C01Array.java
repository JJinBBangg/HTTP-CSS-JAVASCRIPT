package lecture.p0501array;

public class C01Array {
	public static void main(String[] args) {
		// array (배열)
		// 여러값을 가진 자료형(data type)
		// 값의 순서가 있음
		// 순번은 0~

		// 배열타입( 각 값의 type이 int인 배열)

		int[] a = new int[2];
		a[0] = 1;
		a[1] = 2;

		System.out.println(a[0]);
		System.out.println(a[1]);
		int c;
		c = a[0];
		System.out.println(c);
		System.out.println(a[0]);
		a[0] = 99;
		System.out.println(c);
		System.out.println(a[0]);

		int[] arr2;
		arr2 = new int[4];
		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 123;
		arr2[3] = 456;
	
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);

		for(int i = 0; i < 4; i++) {
			System.out.println(arr2[i]);
		}
	}
}
