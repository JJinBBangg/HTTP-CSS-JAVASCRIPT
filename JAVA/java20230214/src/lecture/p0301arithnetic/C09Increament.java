package lecture.p0301arithnetic;

public class C09Increament {
	public static void main(String[] args) {
		// 증가 연산자 ++ 
		// 감소 연산자 --
		
		int x = 1;
		int y = 1;
		
		x++; // x = 2 
		++x; // x = 3
		
		y--; // y = 0
		--y; // y = -1
		
		System.out.printf("%d, %d%n", x, y);
		
		int z = x++ + 10; // z = 13
		int w = ++y + 10; // y = 10
		
		System.out.printf("%d, %d%n", z, w);
		
		
	}
}
