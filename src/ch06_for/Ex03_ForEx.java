package ch06_for;

public class Ex03_ForEx {
    public static void main(String[] args) {
//        1~10까지의 합계를 출력
        int sum = 0;
        //변수를 계산에 사용할 때 가장 기본 값인 0이라는 초기값을 주는 것이
        // 추후에 생길수 있는 에러를 줄일 수 있다.
        for (int i=1; i<=10; i++){
            sum = sum + i;
            System.out.println("i =  " + i);
            System.out.println("sum =  " + sum);
        }
        System.out.println("for문 종료 후 sum =  " + sum);
    }
}
