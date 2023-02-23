package ex.beakjoon;

public class Example01 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int z = (++x) + (y--);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}
}
