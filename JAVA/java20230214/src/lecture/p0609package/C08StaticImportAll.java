package lecture.p0609package;

import static java.lang.Math.*;

public class C08StaticImportAll {
	public static void main(String[] args) {
		double num1 = floor(random() * 6) + 1;
		double num2 = floor(random() * 6) + 1;
		double e = 3 + PI;
		System.out.println((int) num1);
		System.out.println((int) num2);
	}
}
