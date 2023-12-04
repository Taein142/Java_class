package ch02_operator;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		증감연산자
		int num1 = 10, num2 =0, num3 = 0;
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3);
		num2 = ++num1;
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3);
		num2 = ++num1;   // 12  12  0  
		num3 = num1++;   // 13  12  12
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3);
		//		블로그에 정리할 때 여기 부분 잘 정리하기
		
		int result1 = num1++ + ++num2;
//		        26      13        13
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3);
//	                    14   13   12	
		System.out.println(result1);
	}
//	증감연산자 잘 알아두기 어려웡
}
