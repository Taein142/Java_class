package ch07_while;

public class Ex07_WhileEx {
    public static void main(String[] args) {
        /*
         * 1+(-2)+3+(-4)+5+...
         * 처럼 계산을 했을 때 합계가 100이 됐을 때의 숫자를 출력
         * 정답은 199
         * */

        int n = 1;
        int sum = 1;

        while (sum != 100) {
            n++;
            if (n % 2 == 1) {
                sum = sum + n;
            } else {
                sum = sum - n;
            }
        }
        System.out.println(n);


    }
}
