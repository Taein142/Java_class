package ch12_class.ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // 모든 학생정보를 관리하는 저장소 역할의 리스트
    // 저장, 수정, 삭제 등의 처리는 Repository에서만 이루어지도록 하기 위해 private
    // 값을 계속 유지하기 위해 static
    private static List<StudentDTO> studentDTOList = new ArrayList<>();
    // ( static을 붙여 초기화 되지 않고 자신의 값을 유지할 수 있도록 함.)
    // DTO 에 간섭하는 모든 것은 Repository에서 이루어 질 수 있도록 함. (DB처럼 쓸거임)

    public void method1() {
        System.out.println("StudentRepository.method1");
    }

    /**
     * method name: method2
     * parameter: String
     * return: x
     * 실행내용: 전달받은 매개변수 값 출력
     */
    public void method2(String str1) {
        System.out.println("str1 = " + str1);
    }

    /**
     * method name: method3
     * parameter: StudentDTO
     * return: boolean
     * 실행내용: 전달받은 DTO 객체를 List에 저장하고 결과를 리턴     *
     */

    public boolean method3(StudentDTO studentDTO) {
//        if (studentDTO.getId() == null) {
//            System.out.println("비~~~~상~~~~!!!!!");
//        }
        System.out.println("studentDTO = " + studentDTO);
//        boolean result = studentDTOList.add(studentDTO);
//        return result;
        return studentDTOList.add(studentDTO);
    }

    /**
     * return type: List
     */
    public List<StudentDTO> method4() {
        return studentDTOList;
    }

    /*
    * name: method5
    * parameter: Long
    * return StudentDTO
    * */
    public StudentDTO method5(Long id){
        StudentDTO studentDTO = null;
        // id와 일치하는 데이터가 있으면 해당 DTO 객체를 리턴하고
        // 없으면 null을 리턴함.
        for (int i =0; i< studentDTOList.size(); i++){
            if(id.equals(studentDTOList.get(i).getId())){
                studentDTO = studentDTOList.get(i);
            }
        }
        return studentDTO;
    }
}
