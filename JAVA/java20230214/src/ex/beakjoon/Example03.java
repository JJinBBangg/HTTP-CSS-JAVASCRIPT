package ex.beakjoon;

public class Example03 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;

		int pencilsPerStudents = (pencils / students);
		System.out.println(pencilsPerStudents);

		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);

		int value = 356;
		System.out.println(value - (value % 100));
	
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop+lengthBottom)*height / 2.0;
		double area2 = (lengthTop+lengthBottom)*height * 1.0 / 2;
		double area3 = (double)(lengthTop+lengthBottom)*height / 2;
		double area4 = (double)((lengthTop+lengthBottom)*height / 2);
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
		
		double x = 10;
		double y = 0.0;
		double z = x % y;
		
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println(result);
		}
		
		int xx = 10;
		int yy = 20;
		int zz = (++xx) + (yy--);
		System.out.println(zz);
		
	}
}
