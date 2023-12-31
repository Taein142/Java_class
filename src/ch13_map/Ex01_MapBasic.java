package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        //key: 정수(int), value: String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "안녕");
        map1.put(2, "hello");
//        map1.put(3, 100); // value 타입 불일치
//        map1.put("4", "안녕하세요"); // key 타입 불일치
        // key가 1인 데이터
        System.out.println(map1.get(1));
        String s1 = map1.get(2);
        System.out.println("s1 = " + s1);
        map1.put(100, "ㅎㅎㅎㅎ"); // 혼란방지를 위해 되도록 순차적으로 key값을 설정하자.
        map1.put(1, "안녕하십니까");
        System.out.println(map1.get(1));
        // 반복문으로 접근`
        for (Integer i : map1.keySet()) {
            System.out.println("i = " + i);
        }

        // key: String, value: String
        Map<String, String> map2 = new HashMap<>();
        map2.put("가", "안녕");
        map2.put("나", "ㅎㅎㅎ");
        map2.put("a", "ㅋㅋㅋ");
        System.out.println(map2.get("a"));

        // 반복문
        for (String s : map2.keySet()) {
            System.out.println("s = " + s);
        }
        // 위 반복문에서 String의 경우 문서 목차 구조와 같이 순번이 진행됨을 알 수 있다.
        // 가->a->나->b=>....

        Map<Long, String> map3 = new HashMap<>();
        String ss1 = map3.put(1L, "안녕");
        System.out.println("ss1 = " + ss1); // null
        String ss2 = map3.put(2L, "hello");
        System.out.println("ss2 = " + ss2); // null
        String ss3 = map3.put(1L, "안녕하세요");
        System.out.println("ss3 = " + ss3); // 안녕
    }
}
