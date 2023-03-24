package lecture.p0305conditional;

public class C01Conditional {
	public static void main(String[] args) {
		// 삼항(ternary), 조건(conditional), ?
		// 1항 ? 2항 : 3항
		// 1항의 결과가 true면 연산결과가 2항
		// 1항의 결과가 false면 연산결과가 3항
		
		int x = 5;
		int y = 10;
		
		int r1 = true ? x : y;
		System.out.println(r1);

		int r2 = false ? x : y;
		System.out.println(r2);
	}
}
