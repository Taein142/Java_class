package ch11_arraylist.ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체를 답기 위한 List 선언
        // studentList

        List<Student> studnetList = new ArrayList<>();

        // Student 객체
        Student student1 = new Student(1L, "학생1", "23-721214", "영문과", "010-1234-5678");
        studnetList.add(student1);
        Student student2 = new Student(2L, "학생2", "20-121212", "무용과", "010-7845-9865");
        studnetList.add(student2);

        System.out.println("studnetList = " + studnetList.get(0));
        System.out.println("studnetList = " + studnetList.get(1));

        // 타입값이 Student 인 이유는
        // 여러 타입의 필드값이 들어있는 클래스 Student의 정보를 전부 가져다 쓰므로
        // 변수 타입 자체를 그 클래스 명(Student)로 하는 것이다.
        // 그리고 그 변수는 객체와 동일시 됨. a.솰라솰라 다 가능
        Student a = studnetList.get(0);
        System.out.println("a = " + a);
        System.out.println(a.getStudentName());

        // 1번 인덱스에 담긴 객체의 학과만 출력
        Student b = studnetList.get(1);
        System.out.println(b.getStudentMajor());
        System.out.println(studnetList.get(1).getStudentMajor());

        System.out.println("--------------");
        // 반복문
        for (int i = 0; i < studnetList.size(); i++) {
            System.out.println("studentList = " + studnetList.get(i));
            // 학생의 이름만 따로 출력
            System.out.println("studnetList = " + studnetList.get(i).getStudentName());
        }

        for (Student stu : studnetList) {
            System.out.println(stu);
            System.out.println("stu.getStudentMajor() = " + stu.getStudentMajor());
        }


    }
}
