package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {
    public static void main(String[] args) {
        /*
        크기가 3인 정수형 배열을 선언하고
        실행 했을 때 스캐너로 정수값을 읿력받아 배열에 저장
        배열에 저장된 값의 총합, 평균 계산
        */
        int sum = 0;
        int ave;
        int[] numbers1 = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = scanner.nextInt();
            sum += numbers1[i];
        }
        System.out.println("저장소 numbers에 저장된 값의 총합은 " + sum + " 이고,");
        ave = sum / numbers1.length;
        System.out.println("평균은 " + ave + " 이다.");
    }
}
