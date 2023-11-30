package ch02_operator;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술연산자 실습2
		int num1 = 4;
		int num2 = 29;
		System.out.println("덧셈결과 "+num1+num2);
		System.out.println("덧셈결과 "+(num1+num2));
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
//		계산 결과를 담을 변수 활용
		int result = 0;
		result = num1+num2;
		System.out.println(result);
		
//		계산 결과 변수를 따로 선언
		int sumResult = num1+num2;
		System.out.println(sumResult);
		int subResult = num1-num2;
		System.out.println(subResult);
		int mulResult = num1*num2;
		System.out.println(mulResult);
		int divResult = num1/num2;
		System.out.println(divResult);
		int remainResult = num1%num2;
		System.out.println(remainResult);
	}

}
