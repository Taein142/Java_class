package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        while (run) {
            System.out.print(">");
            String word = scanner.nextLine();
            System.out.println(word);
            if (word.equals("종료")) {
                run = false;
            }
        }
        /*
        * Scammer scanner = new Scanner(System.in);
        * System.out.println("메시지를 입력하세요");
        * System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        *  String inputString = "";
        * boolean run = true;
        * String answer = "종료";
        * // 프로그램을 종료하는 키워드인 종료가 절대로 바뀌지 않을 경우
        * final String ANSWER = "종료";
        * // final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.
        * while(run){
        *   System.out.print(">");
        *   inputString = scan.nextLine();
        *   System.out.println(inputString);
        *   if(inputString.equals(ANSWER)){
        *       run = False;
        *   }
        * }
        * */

    }
}
