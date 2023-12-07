package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        /*
        위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
        입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 : ");
        int x = scanner.nextInt();
        for (int y = 0; y < num.length; y++) {
            if (x == num[y]) {
                System.out.println("입력한 숫자는 " + y + "번 저장소에 있다.");
            }
        }
    }
}
