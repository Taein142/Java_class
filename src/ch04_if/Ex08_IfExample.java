package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		// 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기
//		(같은 숫자는 입력하지 않는다고 가정)
//		입력 예
<<<<<<< HEAD
//		 첫번째 숫자:
//		 두번째 숫자:
//		 세번째 숫자:
=======
//		 첫번째숫자: 
//		 두번째숫자: 
//		 새번째숫자:		
>>>>>>> origin/main
//		출력예
//		 가장 큰 숫자는 ??입니다.

		System.out.println("서로 다른 정수 3개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
<<<<<<< HEAD
		int a;
		int b;
		int c;
=======
		int a = 0, b = 0, c = 0;
>>>>>>> origin/main
		System.out.print("첫번째 숫자: ");
		a = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		b = scanner.nextInt();
		System.out.print("세번째 숫자: ");
		c = scanner.nextInt();

		if (a > b && a > c) {
			System.out.println("최댓값은 " + a + " 입니다.");
<<<<<<< HEAD
		} else if (b > a && b > c) {
=======
		} else if (b < a && b > c) {
>>>>>>> origin/main
			System.out.println("최댓값은 " + b + " 입니다.");
		} else if (c > a && c > b) {
			System.out.println("최댓값은 " + c + " 입니다.");
		}
	}

}
