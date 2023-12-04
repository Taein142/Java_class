package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
//		성적 출력 예제 응용
//		입력값: 학년(year), 점수(score)
//		처리
//		 - 1~3학년은 60점 이상이면 합격
//		 - 4학년은 70점 이상이어야 합격

		Scanner scanner = new Scanner(System.in);
		System.out.print("학년을 입력해주세요 : ");
		int year = scanner.nextInt();
		if (year < 0 || year > 4) {
			System.out.println("학년(year)을 다시 입력해주세요.(1~4까지)");
		} else {
			System.out.print("점수를 입력해주세요 : ");
			int score = scanner.nextInt();
			if (year == 4) {
				if (score >= 70) {
					System.out.println("합격입니다.");
				} else {
					System.out.println("불합격입니다.");
				}
			} else {
				if (score >= 60) {
					System.out.println("합격입니다.");
				} else {
					System.out.println("불합격입니다.");
				}
			}
		}
	}
}
