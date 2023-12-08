package ch09_array;

import java.util.Scanner;

public class Ex05_Array {
    public static void main(String[] args) {
        /*거스름돈 계산하기
          필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
          예)
                170 이라고 입력하면
                100원 1개
                50원 1개
                10원 2개

                780 이라고 입력하면
                500원 1개
                50원 1개
                10원 3개
         */
        int[] coin = {500, 100, 50, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("거스름돈 입력 : ");
        int charge = scanner.nextInt();
        for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + "원 " + (charge / coin[i]) + "개");
            charge %= coin[i]; // 입력했던 값이 나머지 값이 되도록 재정의
        }

        /*
        // 선생님의 답안
        int change = scanner.nextInt();
        int count = 0;
        // 거스름돈 / 동전 = 몫(갯수)
        for (int i = 0; i< coin.length; i++){
            count = change / coin[i];
            System.out.println(coin[i] + "원 동전: " + count + "개");
            change = change % coin[i];
        }
        // ... 어라? 똑같네?
         */
    }
}
