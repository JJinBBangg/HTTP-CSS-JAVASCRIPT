package ex.beakjoon;

public class Ex9020 {
	public static void main(String[] args) {
		int res = 0;
		int i = 1; 
		while (i<=100) {
			if(i % 3 == 0) {
				res += i;
			}
			i++;
		}
		
		System.out.println(res);
		int dice1 = 0;
		int dice2 = 0;
		do {
			dice1 = (int) (Math.random()*6)+1;
			dice2 = (int) (Math.random()*6)+1;
			System.out.println("("+dice1+", "+dice2+")");
		} while(dice1 + dice2 != 5);
	
		
	}
}
