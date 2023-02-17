package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1>15) {
			int v2 = v1-10;
		}
//		int v3 = v1 - v2 + 5; // v2는 다른 코드블럭에서 생성된 변수라 사용불가능
	}
}