package ex.thisisjava;

public class Ex120906 {
	public static void main(String[] args) {
		int n = 1234;
		int answer = 0;
		String[] arr =String.valueOf(n).split("");
		for(String s : arr) {
			answer += Integer.valueOf(s);
		}
		
	}
}
