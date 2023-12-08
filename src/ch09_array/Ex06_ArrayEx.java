package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /*
        크기가 5인 정수형 배열을 선언하고
        스캐너로 배열에 값을 저장한 뒤
        입력된 값 중에서 가장 큰 값을 출력
         */

        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[5];
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(i + "번 인덱스 값을 입력하세요 : ");
            numbers1[i] = scanner.nextInt(); // 배열 값에 저장
            // 최댓값 찾기
            if (max < numbers1[i]) {
                max = numbers1[i];
            }
        }
        System.out.println("배열 numbers1의 저장된 값 중 최댓값은 " + max + " 이다.");
    }
}
