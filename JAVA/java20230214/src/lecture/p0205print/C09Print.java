package lecture.p0205print;

public class C09Print {
	public static void main(String[] args) {
		// width 출력할 때 차지할 문자칸 수
		System.out.printf("%d%n", 300);
		System.out.printf("%4d%n", 300);
		System.out.printf("%5d%n", 300);
		System.out.printf("%6d%n", 1234567); // 숫자 길이가 초과되더라도 출력됨

		System.out.printf("%6s%n", "hi");
		System.out.printf("%6s%n", "hello world"); // 문자열 길이가 초과되더라도 출력됨

		int age = 33;
		String name = "son";

		System.out.printf("나이는 %2$3d, 이름은 %1$10s", name, age);

		
	}
}
