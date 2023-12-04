package ch04_if;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
//		중첩 if문을 적용한 학점 출력
//		100점을 초과하거나 0점 미만의 점수를 입력하면 '입력범위를 초과하였습니다.'출력
//		0~100점 사이의 값을 입력했다면 앞의 예제에서 했던 학점 출력을 진행.
//		단, 각 조건마다 학점 값을 출력하는 것이 아니라 학점 출력을 위한 print 문장은 한번만 사용
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = scanner.nextInt();
		String grade = ""; 
		
		if(score < 0 || score > 100) {
			System.out.println("입력 범위를 초과하였습니다.");
		}else {
			if(score >= 90) {
				grade = "A";
			}else if(score >= 80) {
				grade = "B";
			}else if(score >= 70) {
				grade = "C";
			}else if(score >= 60) {
				grade = "E";
			}else {
				grade = "F";
			}
		}System.out.println("당신의 학점은 " + grade + " 입니다.");

	}

}
