package ch06_for;

public class Ex08_ForEx {
    public static void main(String[] args) {
        //구구단을 외자 구구단을 외자

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                if (j < 9) {
                    System.out.print(i + " * " + j + " = " + (i * j) + "   ");
                } else {
                    System.out.println(i + " * " + j + " = " + (i * j) + "   ");
                }
            }
        }
    }
}
