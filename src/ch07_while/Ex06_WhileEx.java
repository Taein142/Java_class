package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        /*
         * 정수를 입력하고 마지막에 0을 입력하세요
         * ex)
         * 1 2 0
         * 입력한 숫자는 2개 입니다.
         * 평균은 1입니다.
         *
         * 12  438  99 20 0
         * 입력한 숫자는 4개 입니다.
         * 평균은 142 입니다.
         */

//        정수 n 개를 입력하고 마지막에 0을 입력하세요
//        입력한 정수의 개수 출력
//        그들의 평균 출력

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int count = 0;
        int sum = 0;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
        while (run) {
            int num = scanner.nextInt();
            if (num != 0) {
                count++;
                sum = sum + num;
            } else {
                run = false;
                System.out.println("입력한 숫자는 " + count + "개 입니다.");
                System.out.println("총 합은 " + sum + " 입니다.");
                double ave = (double) sum / count;
                System.out.println("평균은 " + ave + " 입니다.");
            }
        }

    }
}
