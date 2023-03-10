package ex.thisisjava.exam1208;

public class NanoSecond {
	public static void main(String[] args) {
		long st = System.nanoTime();
		int[] scores = new int[1000];
		for(int i = 0; i <scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum+=score;
		}
		double avg = sum / scores.length;
		System.out.println(avg);
		long en = System.nanoTime();
		System.out.println(en-st);
	}
}
