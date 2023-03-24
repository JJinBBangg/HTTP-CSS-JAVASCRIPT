package lecture.p0504string;

public class C03Spliit {
	public static void main(String[] args) {
		// split
		// 특정 문자패턴으로 문자열을 나누어서 배열로 리턴

		String str1 = "hello,java,world,html,css";
		String[] arr1 = str1.split(",");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		String str2 = "spring react vue angular jsp sass";
		String[] arr2 = str2.split(" ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String str3 = "I'm ironman.";
		String[] arr3 = str3.split("");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}
}
