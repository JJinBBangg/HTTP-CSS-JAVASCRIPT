package ex.programmers;

public class Ex120913 {
	public static void main(String[] args) {
		int n = 6;
		String my_str = "abcdef1sdfsd234234234234234234fsdf23123123";
		int num = (int) Math.ceil(my_str.length() / (double) n);
		String[] answer = new String[num];
		for (int i = 0; i < num; i++) {
			answer[i] = my_str.substring(0, my_str.length() / n < 1 ? my_str.length() % n : n );
			my_str = my_str.replace(answer[i], "");
			System.out.println(answer[i]);
		}

	}
}
//

