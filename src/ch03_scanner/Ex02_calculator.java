package ch03_scanner;


import java.util.Scanner;


public class Ex02_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	정수 2개를 각각 스캐너로 num1, num2에 입력받아서
		//	입력받은 수의 합을 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하시오. ");
//		위에 것 보다 println를 이용해서
//		첫번째 숫자, 두번째 숫자 따로 해주는 게 더 보기 좋다.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num1+num2);
	}

}
