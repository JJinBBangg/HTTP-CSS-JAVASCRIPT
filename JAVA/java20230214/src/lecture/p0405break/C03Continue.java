package lecture.p0405break;

public class C03Continue {
	public static void main(String[] args) {
		boolean res = true; 
		while (true) {
			System.out.println("실행문1");
			if(res) {
				continue;
			}
			System.out.println("실행문2");
		}
	}
}
