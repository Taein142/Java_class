package ch06_for;

import java.util.Scanner;

public class Ex09_ForEx {
    public static void main(String[] args) {
        /*
        * 4x + 5y = 60 을 만족하는 x, y 값을 출력
        * x, y 는 1이상 10이하인 정수이다.
        *
        * 출력(정답)
        * 5,8  10,4,
        */
        for(int i=1; i<=10; i++){
            for(int j =1; j<=10; j++){
                if((4*i)+(5*j)==60){
                    System.out.print(i + ", " + j);
                    System.out.print("\t");
                }
            }
        }
        System.out.print("\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("a를 입력하세요. ");
        int a = scanner.nextInt();
        System.out.print("b를 입력하세요. ");
        int b = scanner.nextInt();
        System.out.print("c를 입력하세요. ");
        int c = scanner.nextInt();
        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= 100; j++){
                if((a*i) + (b*j) == c){
                    System.out.println("x가 " + i + " 이고, y가 " + j + " 일때,");
                    System.out.println(a + "x + " + b + "y = " + c + " 이다.");
                }
            }
        }



    }
}
