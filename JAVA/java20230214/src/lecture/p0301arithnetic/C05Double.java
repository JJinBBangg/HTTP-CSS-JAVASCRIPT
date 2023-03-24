package lecture.p0301arithnetic;

import java.math.BigDecimal;

public class C05Double {
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;

		double c = a + b;

		System.out.println(c);

		BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");

		BigDecimal res = num1.add(num2);
		System.out.println(res);
	}
}
