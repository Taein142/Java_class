package ch16_exception;

import java.util.ArrayList;
import java.util.List;

public class Ex01_Exception {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("안녕");
        stringList.add("오늘은 수요일");
        try {
            for (int i = 0; i <= stringList.size(); i++) {
                System.out.println("stringList = " + stringList.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 예외 발생!");
        }
        System.out.println("프로그램 끝");
    }
}
