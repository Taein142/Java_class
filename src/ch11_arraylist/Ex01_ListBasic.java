package ch11_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ListBasic {
    public static void main(String[] args) {
//        <> 안에는 대문자로 시작하는 단어만 올 수 있다.
        List<Integer> intList = new ArrayList<>(); // spring 때를 위해 위해 요게 best
        ArrayList<Integer> intList2 = new ArrayList<>(); // 되지만 다른 곳에서 안되므로 사용x
//      List<Integer> intList3 = new List<>(); 안됨. 인테페이스 개념쪽이니 걍 안된다고 생각.

        // 10이라는 데이터 추가
        System.out.println(intList.add(10));
        System.out.println("intList.size() = " + intList.size());
        intList.add(100);
        // 1번 인덱스에 999를 추가
        intList.add(1, 999);
        // 0번 인덱스에 담긴 데이터 출력
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList get(1) = " + intList.get(1));
        System.out.println("intList get(2) = " + intList.get(2));
        System.out.println("intList.size() = " + intList.size());

        // remove()
        intList.remove(1);
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList get(1) = " + intList.get(1));
//        System.out.println("intList get(1) = " + intList.get(2));
        System.out.println("intList.size() = " + intList.size());

        // String 을 담는 strList 선언
        List<String> strList = new ArrayList<>();
        strList.add("Oh,");
        strList.add(1, "hi");
        System.out.println("strList.get(0) = " + strList.get(0));
        System.out.println("strList.get(1) = " + strList.get(1));
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);

        System.out.println("-----------");
        // for문을 이용하여 intList 에 담긴 데이터를 모두 출력
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        // for each 문법 알아보기
        // for(리스트에 담겨있는 데이터의 타입 a(아무 변수 이름): 출력할 리스트
        for (int a : intList) {
            System.out.println("a = " + a);
        }
        //위랑 같은 람다식 코드 (화살표 함수 사용)
        intList.forEach(a -> {
            System.out.println("a = " + a);
        });

        // for문을 이용하여 strList 에 담긴 데이터를 모두 출력
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        for (String b : strList) {
            System.out.println("b = " + b);
        }
        
        strList.forEach(b->{
            System.out.println("b = " + b);
        });

    }
}
