package ex.thisisjava;

import java.util.*;

public class Ex509_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		List<Student> students = new ArrayList<>();

		int studentNum = 0;
		while (run) {
			System.out.print("""
					-----------------------------------------------------
					1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5종료
					-----------------------------------------------------
					선택>""");
			int select = Integer.valueOf(sc.nextLine());
			switch (select) {
			case 1:
				System.out.print("학생수>");
				studentNum = Integer.valueOf(sc.nextLine());
				for (int i = 0; i < studentNum; i++) {
					System.out.printf("%d번 이름>", i + 1);
					students.add(new Student());
					students.get(i).setName(sc.nextLine());
				}
				break;
			case 2:
				System.out.println("현재 학생수 : " + studentNum + "명");
				boolean a = true;
				while (a) {
					if (students.get(studentNum).getMathScore() != 0
							&& students.get(studentNum).getEnglishScore() != 0) {
						a = false;
					} else {
						System.out.print("학생선택>");
						int num = Integer.valueOf(sc.nextLine()) - 1;
						// 수학점수
						System.out.print("수학점수>");
						int mathScore = Integer.valueOf(sc.nextLine());
						students.get(num).setMathScore(mathScore);
				        //영어점수
						System.out.print("영어점수>");
						int englishScore = Integer.valueOf(sc.nextLine());
						students.get(num).setEnglishScore(mathScore);
					}
				}
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				run = false;
				break;

			}
		}
	}
}
