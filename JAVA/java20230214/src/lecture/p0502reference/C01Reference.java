package lecture.p0502reference;
public class C01Reference {
	public static void main(String[] args) {
		//기본타입
		int a = 3; //a라는 저장공간에 바로저장
		
		//참조타입
		int[] arr = new int[] {3,4,5}; 
		// arr라 배열을 별도의 저장공간을 생성 후 각 값 저장
		// new 연산자 는 위 저장공간의 주소를 가리킴 
		// 주소값을 참조
		
		int[] arr1 = {5,6,7};
		int[] arr2 = arr1;
		
	}
}
