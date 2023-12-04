package ch03_scanner;

// java.util 패키지에 소속된 Scanner 클래스를 가져옴.
import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scanner 라는 이름의 Scanner 클래스 객체 선언
		Scanner scanner = new Scanner(System.in);
		// Scanner 에 빨간 밑줄이 뜨면 마우스를 대고 import를 눌러주면 된다.
		System.out.print("숫자를 입력하세요: ");
		// 'ln'옵션은 줄을 바꿔버리는 옵션이다.
		int num1 = scanner.nextInt();
		System.out.println(num1);
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		System.out.println(name);
		
		scanner.nextLine();
		//가끔 오류 있어서 이렇게 한 줄 줘야할 경우가 있음
		
		System.out.print("주소를 입력하세요: ");
		String address = scanner.nextLine();
		System.out.println(address);
//		.next() 는 뛰어쓰기 전까지만 입력해주기 때문에
//		.nextLine()을 사용해야 한다.
		
		
		
		
	}

}
