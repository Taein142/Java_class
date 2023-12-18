package ch11_class.member;

import java.util.Scanner;
import java.util.List;

public class MemberService {
    private static String loginEmail = null;
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);
    String memberEmail;
    String memberPassword;

    public void join() {
        System.out.println("회원정보를 입력해주세요.");
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.join(memberDTO);
        if (result) {
            System.out.println("가입이 완료되었습니다.");
        } else {
            System.out.println("가입에 실패하였습니다.");
        }
    }


    public void login() {
        System.out.println("아이디와 비밀번호를 입력해 주세요.");
        System.out.print("아이디: ");
        memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        memberPassword = scanner.next();
        MemberDTO memberDTO = memberRepository.login(memberEmail, memberPassword);
        if (memberDTO != null) {
            loginEmail = memberEmail;
            System.out.println("로그인 성공");
            System.out.println("memberDTO = " + memberDTO);
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void update() {
        if (loginEmail != null) {
            System.out.println("비밀번호를 입력해주세요");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.checkPassword(memberPassword);
            if (memberDTO != null) {
                System.out.println("변경할 정보를 입력하세요");
                System.out.print("아이디: ");
                String newMemberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String newMemberPassword = scanner.next();
                System.out.print("이름: ");
                String newMemberName = scanner.next();
                System.out.print("전화번호: ");
                String newMemberMobile = scanner.next();
                boolean updateResult = memberRepository.update(newMemberEmail, newMemberPassword, newMemberName, newMemberMobile);
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
            System.out.println("비밀번호를 입력해주세요");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.checkPassword(memberPassword);
            boolean result;
            if (memberDTO != null) {
                result = memberRepository.delete(memberPassword);
                if (result) {
                    System.out.println("탈퇴되었습니다. 지금까지 감사합니다.");
                } else {
                    System.out.println("회원 탈퇴에 실패하였습니다.");
                    System.out.println("당신은 여전히 저희와 함께 해야합니다.");
                }
            }
        } else {
            System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
            System.out.println("로그인 해주세요");
        }
    }

    public void logout() {
        if (loginEmail != null) {
            MemberDTO memberDTO = memberRepository.logout();
        } else {
            System.out.println("로그인 해야 이용할 수 있는 서비스입니다.");
            System.out.println("로그인 해주세요");
        }
    }
}
