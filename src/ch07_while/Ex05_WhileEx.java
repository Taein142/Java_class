package ch07_while;

import javax.swing.*;
import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /*
        * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
        * 반복문 안에서 해당 숫자를 맡출 때까지 계속 숫자를 입력받도록 하고
        * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력하라.*/

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int sum = 0;

        int i = ((int)(Math.random()*100)+1);
        while (run){
            sum = sum +1;
            int a = scanner.nextInt();
            if (a < i){
                System.out.println("더 크게");
            }else if(a > i) {
                System.out.println("더 작게");
            }else{
                run = false;
                System.out.println(sum + " 번 만에 맞추었습니다.");
            }
        }
    }
}
