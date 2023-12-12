package ch10_class.ex9;

public class Student {
    /*
     * 필드
     * 이름(studentName)
     * 학번(studentNumber)
     * 학과(studentMajor)
     * 전화번호(studentMobile)
     * */
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    Student student1 = null;
    Student student2 = null;

    // 각 필드의 getter/setter 메서드
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    // 기본생성자
    public Student() {

    }

    // 모든 필드를 매개변수로 하는 생성자
    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile) {

    }

    // 필드에 저장된 겂을 출력하는 print() 메서드
    public void print(Student student) {
        String name = student1.getStudentName();
        String number = student1.getStudentNumber();
        String major = student1.getStudentMajor();
        String mobile = student1.getStudentMobile();
        System.out.println(student1);
        String name2 = student2.getStudentName();
        String number2 = student2.getStudentNumber();
        String major2 = student2.getStudentMajor();
        String mobile2 = student2.getStudentMobile();
        System.out.println(student2);
    }
}
