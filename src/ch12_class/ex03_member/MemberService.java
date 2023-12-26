package ch12_class.ex03_member;

import java.util.Scanner;
import java.util.List;

public class MemberService {
    private static String loginEmail = null;
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);

    public void join() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        String memberEmail;
        System.out.println("회원정보를 입력해주세요.");
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            // checkResult가 true => 사용가능(반복문 종료), checkResult가 false => 사용불가(다시 이메일입력)
            checkResult = memberRepository.loginCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("사용중인 이메일 입니다.");
                System.out.println("다른 이메일을 입력해주세요");
            }
        } while (!checkResult); // checkResult 값이 false라면 계속 반복되도록

        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result1 = memberRepository.join(memberDTO);
        if (result1) {
            System.out.println("가입이 완료되었습니다.");
        } else {
            System.out.println("가입에 실패하였습니다.");
        }
    }

    public void login() {
        System.out.println("이메일과 비밀번호를 입력해 주세요.");
        System.out.print("이메일: ");
       String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        MemberDTO loginResult = memberRepository.login(memberEmail, memberPassword);
        if (loginResult != null) {
            loginEmail = memberEmail;
            System.out.println("로그인 성공");
            System.out.println(memberEmail + "님 환영합니다.");
            System.out.println("loginResult = " + loginResult);
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

    public void update() {
        if (loginEmail != null) {
            System.out.println("비밀번호를 입력해주세요");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.checkPassword(memberPassword);
            if (memberDTO != null) {
                System.out.println("변경할 정보를 입력하세요");
                System.out.print("이름: ");
                String newMemberName = scanner.next();
                System.out.print("전화번호: ");
                String newMemberMobile = scanner.next();
                boolean updateResult = memberRepository.update(loginEmail, newMemberName, newMemberMobile);
                if (updateResult) {
                    System.out.println("정보가 수정되었습니다.");
                    System.out.println(memberDTO);
                } else {
                    System.out.println("처리 중 에러가 발생하여 정보수정이 연기되었습니다.");
                }
            } else {
                System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
            }
        } else {
            System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
            System.out.println("로그인 해주세요");
        }
    }

    public void delete() {
        if (loginEmail != null) {
            System.out.println("탈퇴하시겠습니까? 그렇다면");
            System.out.println("비밀번호를 입력해주세요");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.login(loginEmail, memberPassword);
            boolean result;
            if (memberDTO != null) {
                result = memberRepository.delete(loginEmail);
                if (result) {
                    System.out.println("탈퇴되었습니다. 지금까지 감사합니다.");
                } else {
                    System.out.println("회원 탈퇴에 실패하였습니다.");
                    System.out.println("당신은 여전히 저희와 함께 해야합니다.");
                }
            } else {
                System.out.println("잘못 입력하였습니다.");
                System.out.println("메인 메뉴로 돌아갑니다.");
            }
        } else {
            System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
            System.out.println("로그인 해주세요");
        }
    }

    public void logout() {
        if (loginEmail != null) {
            loginEmail = null;
            System.out.println("로그아웃되었습니다.");
        } else {
            System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
            System.out.println("로그인 해주세요");
        }
    }
}
