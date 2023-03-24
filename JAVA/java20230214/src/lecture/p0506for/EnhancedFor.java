package lecture.p0506for;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr1 = {1,6,10,9,1,5};
	
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//enghanced for (향상된 for). foreach
		//index 관계없이 배열에 있는 각 요소를 반복하여 출력
		for (int res : arr1) {
			System.out.println(res);
		}
	}
}
