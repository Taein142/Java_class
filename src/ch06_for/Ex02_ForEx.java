package ch06_for;

public class Ex02_ForEx {
    public static void main(String[] args) {
//        1~10 까지 순서대로 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
        }
//        2 4 6 8 10 출력
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {     // if문 형태 말고 증감값을 i+=2로 해도 됨.
                System.out.println("j=" + j);
            }
        }
//        5 4 3 2 1 출력
        for (int k = 5; k > 0; k--) {
            System.out.println("kㄴ=" + k);
        }
    }
}
