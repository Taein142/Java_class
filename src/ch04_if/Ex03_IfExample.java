package ch04_if;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		
//		스캐너로 점수(score)를 하나 입력받아서
//		90이상이면 A, 80점 이상이면 B, 70점 이상이면 C,
//		60점이상이면 D, 60점보다 낮은 점수면 F
//		를 출력하여라
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하십시오.  점수 : ");
		int score = scanner.nextInt();
		
		if(score >= 90) {
			System.out.println("당신의 학점은 A 입니다.");
		}else if(score >= 80) {
			System.out.println("당신의 학점은 B 입니다.");
		}else if(score >= 70) {
			System.out.println("당신의 학점은 C 입니다.");
		}else if(score >= 60) {
			System.out.println("당신의 학점은 D 입니다.");
		}else {
			System.out.println("당신의 학점은 F 입니다.");
		}

		
		
		
	}

}
