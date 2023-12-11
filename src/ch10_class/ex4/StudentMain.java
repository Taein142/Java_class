package ch10_class.ex4;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "학생1";
        student1.studentNumber = "22-98765432";
        student1.studentMajor = "전기학과";
        System.out.println("student1.studentName = " + student1);

        // ao개변수 있는 생성자로 student2 객체 선언
        Student student2 = new Student("학생2", "23-12345678", "행정학");
        System.out.println("studentName = " + student2);
    }
}
