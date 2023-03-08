package lecture.p1201object;

public class C13Enum {
	public static void main(String[] args) {
		Season season = Season.SPRING;

		String a = switch (season) {
		case SPRING, FALL ->
			"좋은 계절이다.";
		case SUMMER ->
			"덥다";
		case WINTER ->
			"춥다";
//		default ->
//			"잘못입력";
		};
		
		System.out.println(a);
	}
}
