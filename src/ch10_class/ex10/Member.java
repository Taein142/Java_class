package ch10_class.ex10;

import java.util.Objects;

/**
 * 회원 정보 클래스
 * 회원 정보
 * - 이메일(memberEmail)
 * - 비밀번호(memberPassword)
 * - 이름(memberName)
 * - 전화번호(memberMobile)
 * getter/setter
 * 생성자 2가지
 * 로그인 처리 메서드
 * name: memberLogin
 * parameter: memberEmail, memberPassword
 * return type: boolean
 * 실행내용: 이메일, 비밀번호가 일치하면 true,
 * 일치하지 않으면 false 리턴
 */
public class Member {
    // 필드
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    // getter/setter
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

    // 기본생성자
    public Member() {

    }

    // 모든 매개변수를 받는 생성자
    public Member(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        this.memberEmail = memberEmail;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
    }

    // 로그인 처리 메서드
    public boolean memberLogin(String memberEmail, String memberPassword) {
        int failNumber = 0;
        boolean run = true;
        if (Objects.equals(memberEmail, this.memberEmail) && Objects.equals(memberPassword, this.memberPassword)) {
            System.out.println("로그인 성공.");
            return true;
        } else {
            System.out.println("로그인 실패. 다시 입력해주세요");
            System.out.println("로그인 실패 횟수: " + failNumber + "회");
            failNumber += 1;
            if (failNumber == 3) {
                run = false;
            }
            return false;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}