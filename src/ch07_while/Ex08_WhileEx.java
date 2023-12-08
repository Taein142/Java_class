package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        int money= 213613;
        boolean run = true;
        int sum = money;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.print("선택>");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.print("예금액> ");
                    int plus = scanner.nextInt();
                    sum = sum + plus;
                    System.out.println("현재 잔액은 " + sum + "원입니다.");
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int minus = scanner.nextInt();
                    if (sum >= minus){
                        sum = sum - minus;
                        System.out.println("현재 잔액은 " + sum + "원입니다.");
                    }else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("젼재 잔액은 " + sum + "원입니다.");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("설정된 숫자(1~4)를 입력해주세요");
                    break;
            }
        }
    }
}
