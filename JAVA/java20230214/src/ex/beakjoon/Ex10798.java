package ex.beakjoon;

import java.util.Scanner;

//백준 10798
public class Ex10798 {
	public static void main(String[] args) {
		String input = """
				ABCDE
				abcde
				01234
				FGHIJ
				fghij""";
		Scanner sc = new Scanner(input);
//		Scanner sc = new Scanner(System.in);
		String answer = ""; 
		String str = "";
		String[][] arr= new String[5][];
		String[] arr1 = new String[15];
		arr[0][1] = "s";
		arr[0][2] = "t";
		
				
		for(int i = 0; i < 5; i++) {
			arr1 = sc.nextLine().split("");
			for(int j = 0; j < arr1.length; j++) {
				arr[i][j] = arr1[j];
			}			
		}
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] != null)answer += arr[j][i];
			}			
		}
		System.out.println(answer);
		
		
		
		
		
	}
}
