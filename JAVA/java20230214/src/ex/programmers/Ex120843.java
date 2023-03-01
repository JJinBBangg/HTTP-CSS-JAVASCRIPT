package ex.programmers;
//int[] numbers, int k
public class Ex120843 {
	public int solution() {
		int[] numbers = {1,2,3,4};
		int k= 2;
		int answer = 0;
		int[] res = new int[(2*k)+1];
			for(int j = 0; j<(k*2)+1; j++) {
				res[j] = numbers[((k*2)+1)%numbers.length];				
			}
		answer = res[k*2+1];
		System.out.println(answer);
		return answer;
	
}}
