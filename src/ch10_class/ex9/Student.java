package ch10_class.ex9;

public class Student {
    // 필드, getter/setter, 기본생성자, 매개변수 생성자, toString
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

    // 각 필드의 getter/setter 메서드
    // getter/setter의 단축키
    //alt insert
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    // 생성자는 클래스와 대소문자까지 다 똑같으며 void, return 타입이 없다.
    // 기본생성자
    public Student() {

    }

    // 모든 필드를 매개변수로 하는 생성자
    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }

    // 필드에 저장된 겂을 출력하는 print() 메서드
    public void print() {
        System.out.print("이름: " + studentName);
        System.out.print(" 학번: " + studentNumber);
        System.out.print(" 전공: " + studentMajor);
        System.out.println(" 휴대폰 번호: " + studentMobile);
    }

    /*
    * method name: toString
    * return type: String
    * parameter: x
    * */
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
