package ch10_class.ex9;

public class StudentMain {
    public static void main(String[] args) {

        // 기본생성자로 student 클래스 객체 만들고
        // setter를 이용하여 필드값을 채우기
        Student student1 = new Student();
        student1.setStudentName("김아무개");
        student1.setStudentNumber("16-12345678");
        student1.setStudentMajor("법학과");
        student1.setStudentMobile("010-5555-7878");

        // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        Student student2 = new Student("박뭐시기", "17-71024342", "심리학과", "010-5467-8912");

        // 각각의 객체에서 print 메서드 호출하여 필드값 출력
        student1.print();
        student2.print();
    }
}
