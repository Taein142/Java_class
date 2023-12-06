package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /*
         * while 문으로 1부터 10까지의 합계 출력
         * 출력예
         * 1+2+3+...+9+10=55*/

        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            if (i < 10) {
                System.out.print(i + " + ");
                i++;
            } else {
                System.out.print(i + " = ");
                break;
            }
        }
        System.out.println(sum);

        int j = 1;
        int sum2 = 0;
        boolean run = true;
        while (run) {
            sum2 = sum2 + j;
            if (j <= 9) {
                System.out.print(j + " + ");
                j++;
            } else {
                System.out.print(j + " = ");
                run = false;
            }
        }
        System.out.println(sum2);

        int k = 1;
        int sum3 = 0;
        while (k <= 10) {
            System.out.print(k);
            sum3 += k;
            if (k < 10) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
            k++;
        }
        System.out.println(sum3);
    }
}
