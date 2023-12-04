package ch06_for;

public class Ex01_ForBasic {
    public static void main(String[] args) {
        // 0~3까지 출력
        for(int i =0; i<4; i++){
            System.out.println("i= "+i);
        }

        // 0~4까지 출력
        for(int i =0; i<=4; i++){
            System.out.println("i= "+i);
        }

//  반복변수 초기값이 조건을 만족하지 않는다면
    for (int i = 10; i <= 4; i++){
        System.out.println("내가 보이니?");
        System.out.println("i = "+ i);
    }  // 실행되지 않음
//    System.out.println("i = " + i);
    // 위 상황에서 i는 for문의 지역변수이기에
    // for 문을 벗어나서 사용된 i는 정의되지 않은 상태라
    // 에러를 야기한다.

    int j = 0;
    for (j = 0; j<3; j++){
        System.out.println(" j= " + j);
    }
        System.out.println("반복문 종료 후 j = " + j);


    }
}
