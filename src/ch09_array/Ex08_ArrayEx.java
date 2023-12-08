package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        /*
        스캐너로 입력 받은 숫자의 크기를 갖는 배열을 만들어 봅시다.
        예를 들어 5를 입력하면
        크기가 5인 배열이 만들어져야 함.
        */

        Scanner scanner = new Scanner(System.in);
        int[] num = null;
        System.out.print("배열의 크기: ");
        num = new int[scanner.nextInt()];
        if (num.length > 0) {
            System.out.println("배열 num의 크기는 " + num.length + "이다.");
        } else {
            System.out.println("null");
        }
    }
}
