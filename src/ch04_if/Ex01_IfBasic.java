package ch04_if;

public class Ex01_IfBasic {

	public static void main(String[] args) {
		// if 문
		
		System.out.println("if문 전");
		if(true){
			System.out.println("조건을 만족하면 내가 보여!");
		}
		System.out.println("if문 후");
		
		System.out.println("if문 전");
		boolean cond = false;
		if(!cond){
			System.out.println("조건을 만족하면 내가 보여!");
		}
		System.out.println("if문 후");
		
//		if else
		System.out.println("if else 문 전");
		if(cond) {
			System.out.println("조건 만족");
		}else {
			System.out.println("조건 불만족");
		}
		System.out.println("if else문 후");
		
		int num1 = 10, num2 = 20;
		if(num1 < num2) {
			System.out.println("num2가 크다");
		}else {
			System.out.println("num1이 num2보다 크거나 같다.");
		}
		
//		if else if
		if (num1 > num2) {
			System.out.println("num1이 크다");
		}else if(num1 < num2) {
			System.out.println("num2가 크다");	
		}else if(num1 == num2) {
			System.out.println("num2가 크다");
		}else {
			System.out.println("비교 불가능");
		}
			
		
	}

}
