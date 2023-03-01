package ex.programmers;

public class As2 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int k= 2;
		;
		
		int answer = 0;
		int[] res = new int[k*(numbers.length/k)+(numbers.length%k)+1];
			for(int j = 0; j<k*(numbers.length/k)+(numbers.length%k+1); j++) {
//				res[j] = numbers[];				
			}
		answer = res[(numbers.length/k)+(numbers.length%k+1)];
		System.out.println(answer);
	}
}
