package lecture.p0505null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2};
		
		System.out.println(arr1);
		arr1 = null; // 참조하는 객체없음
		
		int len = arr1.length; // 참조하는 객체 없음 예외발생
		int val = arr1[0];
		
		
	}
}
