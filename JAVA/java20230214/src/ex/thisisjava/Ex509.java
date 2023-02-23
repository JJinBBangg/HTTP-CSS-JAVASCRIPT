package ex.thisisjava;

import java.util.Arrays;
import java.util.Scanner;

public class Ex509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[] scores = {};
		int high = 0;
		int avg = 0;
		int sum = 0;
		 
		Outter : while (true) {
			System.out.print("""
					------------------------------------------------------
					1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
					------------------------------------------------------
					선택>""");
			int select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				System.out.print("학생수>");
				num = Integer.parseInt(sc.nextLine());
				scores = new int[num];
				break;
			case 2:
				for (int i = 0; i < num; i++) {
				System.out.print("scores["+i+"]>");
				scores[i] =  Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for(int i = 0; i < num; i++) {
					System.out.println("scores["+i+"] : "+ scores[i]);	
				}
				break;
			case 4:
				Arrays.sort(scores); 
				
				for(int i = 0; i < num; i++) {
					sum += scores[i]; 
				}
				avg = sum/num;
				high = scores[scores.length-1];	
				System.out.println("최고점수 : "+ high);
				System.out.println("평균점수 : "+avg);
				break;
			case 5:
				break Outter;
			}
		}
	System.out.println("프로그램 종료");
	}
}
