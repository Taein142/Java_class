package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		// 정수 하나를 입력받아서
//		3의 배수인지, 5의 배수인지 또는 3과 5의 공배수인지, 아무것도 아닌지를 출력
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num%3 == 0 && num%5 == 0) {
			System.out.println("num은 3과 5의 공배수이다.");
		}else if(num%3 == 0) {
			System.out.println("num은 3의 배수이다.");
		}else if(num%5 == 0) {
			System.out.println("num은 5의 배수이다.");
		}else {
			System.out.println("num은 그 무엇도 아니다.");
		}

	}

}
