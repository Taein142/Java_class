package ch09_array;


import java.util.Arrays;
import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        boolean run = true;
        int[] student = null;
        int temp = 0;
        int sum = 0;
        double ave = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 학생수입력 | 2.점수입력 | 3.점수목록 | 4. 분석 | 5.종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.print("학생수> ");
                    student = new int[scanner.nextInt()];
                    break;

                case 2:
                    for (i = 0; i < student.length; i++) {
                        System.out.print((i + 1) + "번 학생 점수: ");
                        student[i] = scanner.nextInt();
                    }
                    break;

                case 3:
                    for (i = 0; i < student.length; i++) {
                        System.out.println((i + 1) + "번 학생 점수: " + student[i]);
                    }
                    break;

                case 4:
                    for (int j = 0; j < student.length; j++) {
                        for (int k = j + 1; k < student.length; k++) {
                            if (student[j] < student[k]) {
                                temp = student[j];
                                student[j] = student[k];
                                student[k] = temp;
                            }
                        }
                        sum += student[j];
                    }
                    ave = (double) sum / student.length;
                    System.out.println("최고점수: " + student[0]);
                    System.out.println("평균점수: " + ave);
                    System.out.println("1등: " + student[0]);
                    System.out.println("2등: " + student[1]);
                    System.out.println("3등: " + student[2]);
                    break;

                case 5:
                    System.out.println("시스템을 종료합니다..");
                    run = false;
                    break;

                default:
                    System.out.println("정해진 숫자를 누르지 않았습니다.");
                    System.out.println("시스템이 종료됩니다.");
                    run = false;
                    break;
            }
        }
    }
}


