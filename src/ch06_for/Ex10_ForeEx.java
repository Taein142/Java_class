package ch06_for;

import java.util.Scanner;

public class Ex10_ForeEx {
    public static void main(String[] args) {
        /*
        * 정수를 하나 입력 받고
        * 1부터 입력받은 정수까지 중에서
        * 2의 배수, 3의 배수를 제외한 수의 총 합 출력*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 x를 입력하시오.  ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<=x; i++){
            if (!(i%2==0 || i%3==0)){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
