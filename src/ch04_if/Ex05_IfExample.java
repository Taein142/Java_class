package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
//		정수 하나를 입력받아서 양수, 음수, 0 인지를 출력하라
		
		Scanner scanner = new Scanner(System.in);
		int A;
		A = scanner.nextInt();
		
		if(A > 0) {
			System.out.println("정수 A는 양수이다.");
		}else if(A < 0) {
			System.out.println("정수 A는 음수이다.");
		}else {
			System.out.println("정수 A는 0이다.");
		}
		
	}

}
