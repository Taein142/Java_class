package ch06_for;

public class Ex11_ForEx {
    public static void main(String[] args) {
        /*
        * 별찍기
        * 출력
        * *
        * **
        * ***
        * ****
        * *****
        */
//        for (int i=1; i<=5; i++){   // 줄수, 별을 출력할 횟수
//           for (int j=1; j<=i; j++){   // 별을 줄 수 만큼 출력
//               System.out.print("*");
//           }
//            System.out.print("\n");   // 줄을 바꾸기 위한 용도
//        }

//        심화 모래시계 별찍기
        for (int i=5; i>=1; i--){
            for (int j=0; j<5-i; j++){
                System.out.print(" ");
            }for (int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }for(int j=1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
