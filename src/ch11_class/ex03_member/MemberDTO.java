package ch11_class.ex03_member;

public class MemberDTO {
    //    ## 자바 회원 프로젝트
//### 주요 기능
//- 회원가입
//  - 이메일(memberEmail), 비밀번호(memberPassword), 이름(memberName), 전화번호(memberMobile) 입력
//  - 회원번호(id)는 회원가입시 자동으로 부여
//- 로그인
//    - 로그인시 이메일, 비밀번호를 입력받고 일치하면 '로그인성공', 일치하지 않으면 '로그인실패' 출력
//    - 로그인을 성공하면 loginEmail 이라는 서비스 클래스 전역변수에 로그인에 성공한 회원의 이메일을 저장함.
//            - private static String loginEmail = null 로 서비스클래스 전역변수로 선언.
//            - 회원 목록조회
//    - 회원 목록 출력
//- 회원 정보수정
//    - 로그인을 했다면 변경할 전화번호를 입력받고 수정 처리 진행
//    - 로그인을 하지 않았다면 로그인하세요 출력
//    - 일치하지 않으면 메인메뉴로 돌아감
//- 회원탈퇴
//    - 로그인을 했으면 비밀번호를 한번 더 확인하여 비밀번호가 일치하면 탈퇴 수행
//    - 로그인을 하지 않았다면 로그인하세요 출력
//- 로그아웃
//    - 로그아웃을 하면 로그인 상태 관리 변수를 null로 함
//- 이메일 중복체크 (난이도 있음)
//    - 회원가입시 입력한 이메일 값을 리스트에서 일치하는 값이 있는지 확인 후 일치하는 값이 있다면 사용중인 이메일입니다. 출력 후 다시 이메일을 입력 받음.
//            - 사용가능한 이메일이면 비밀번호를 이어서 입력 받음.
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public MemberDTO() {
    }

    private static Long inValue = 1L;

    public MemberDTO(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.id = inValue++;
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}