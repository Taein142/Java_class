package ch09_array;


import java.util.Arrays;
import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {

        boolean run = true;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 학생수입력 | 2.점수입력 | 3.점수목록 | 4. 분석 | 5.종료");
            System.out.print("선택> ");
            int[] studentNumber = null;
            int[] score = null;
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.print("학생수> ");
                    studentNumber = new int[scanner.nextInt()];
                    temp = studentNumber.length;
                    break;
                case 2:
                    for (int i = 0; i < temp; i++) {
                        System.out.print((i + 1) + "번 학생 점수: ");
                        score[i] = scanner.nextInt();
                        if (i == temp - 1) {
                            score = Arrays.copyOf(score, score.length + 1);
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < temp; j++) {
                        System.out.println(j + "번 학생 점수: " + score[j]);
                    }
                    break;


//            switch (number) {
//                case 1:
//                    System.out.print("학생수> ");
//                    studentNumber = new int[scanner.nextInt()];
//                    studentTemp = studentNumber.length;
//                    break;
//                case 2:
//                    for (int i = 0; i < studentTemp; i++) {
//                        System.out.print((i + 1) + "번 학생 점수: ");
//                        score = new int[scanner.nextInt()];
//                        Arrays
//                    }
//                    break;
//                case 3:
//                    for (int j = 0; j < studentTemp; j++) {
//                        System.out.println((j + 1) + "번 학생 점수: " + score);
//                    }
//                    break;
//                case 4:
//
//
//                    break;
//                case 5:
//
//                    System.out.println("시스템을 종료합니다..");
//                    run = false;
//                    break;
//                default:
//                    System.out.println("정해진 숫자를 누르지 않았습니다.");
//                    System.out.println("시스템이 종료됩니다.");
//                    run = false;
//                    break;
                }

            }
        }
    }


