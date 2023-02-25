package ex.programmers;

public class Ex120839 {
	public static void main(String[] args) {
		String rsp = "050";
		String answer = "";
		char[] arr = rsp.toCharArray();
		for (char a : arr) {
			switch (a) {
			case '2':
				answer += "0";
				break;
			case '0':
				answer += "5";
				break;
			case '5':
				answer += "2";
				break;
			};
		}
		System.out.println(answer);
	}
}
