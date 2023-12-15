package ch12_class.ex1;

import java.util.List;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();

    /*
     * method name: method1
     * parameter:x
     * return:x
     * */
    public void method1() {
        System.out.println("StudentService.method1");
        // Repository의 method1을 호출
        studentRepository.method1();
    }

    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "집에 가고 싶다.";
        studentRepository.method2(str1);
    }

    /*
     * StudentDTO 객체를 생성하고
     * Repository의 method3으로 DTO 객체를 전달함.
     * */
    public void method3() {
        StudentDTO studentDTO = new StudentDTO("이바보", "16-24342", "행정학", "010-5809-1234");
        System.out.println("StudentService.method3");
        boolean result = studentRepository.method3(studentDTO);
        System.out.println("result = " + result);
        if (result) {
            System.out.println("학생이 등록되었습니다.");
        } else {
            System.out.println("학생 등록에 실패하였습니다.");
        }
    }

    /*
     * Repository로 부터 List를 리턴 받아 for 문으로 출력
     * */
    public void method4() {
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for(StudentDTO studentDTO: studentDTOList){
            System.out.println("studentDTO = " + studentDTO);
        }
    }


}
