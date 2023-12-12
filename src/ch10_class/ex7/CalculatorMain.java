package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /*
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Caculator 캘래스에 있는 해당 메서드 실행
         * */
        Calculator calculator = new Calculator();
        boolean run = true;
        int num1, num2;

        while (run) {
            System.out.println("계산을 시작합니다. (1.덧셈 2.뺄셈 3.곱셈 4.나눗셈)");
            System.out.print("실행넘버를 입력해주세요> ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            if (choose == 1) {
                System.out.print("첫번째 숫자> ");
                num1 = scanner.nextInt();
                System.out.print("두번째 숫자> ");
                num2 = scanner.nextInt();
                calculator.sum(num1, num2);
//                run = false;

            } else if (choose == 2) {
                System.out.print("첫번째 숫자> ");
                num1 = scanner.nextInt();
                System.out.print("두번째 숫자> ");
                num2 = scanner.nextInt();
                calculator.sub(num1, num2);
//                run = false;

            } else if (choose == 3) {
                System.out.print("첫번째 숫자> ");
                num1 = scanner.nextInt();
                System.out.print("두번째 숫자> ");
                num2 = scanner.nextInt();
                int result = calculator.mul(num1, num2);
                System.out.println("계산 결과는 " + result + " 이다.");
//                run = false;

            } else if (choose == 4) {
                int result = calculator.div();
                System.out.println("계산 결과는 " + result + " 이다.");
//                run = false;
            } else {
                System.out.println("계산기 종료");
                run = false;
            }
        }
    }
}
