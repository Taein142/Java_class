package ch02_operator;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		논리연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || true);
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		System.out.println(bool1 && bool2);
		
//		bool2, bool3의 OR 연산 결과를 result 라는 변수에 담고 result 변수값 출력
		
		boolean result = bool2 || bool3;
		System.out.println(result);
		
//		num1, num2 정수형 변수에 각각 10, 20을 대입하여 선언하고
//	    num1 > num2 결과를 result1에 저장하고
//		num1 != num2결과를 result3에 저장한 뒤
//		result3의 값을 출력
		
		int num1 = 10;
		int num2 = 20;
		boolean result1 = num1 > num2;
		boolean result2 = num1 != num2;
		boolean result3 = result1 && result2;
		System.out.println(result3);
	
		boolean result4 = (num1 > num2) && (num1 != num2);
		System.out.println(result4);
	}
//		이 페이지 잘 이해하고 알아둬야 됨. 
}