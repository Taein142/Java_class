package ch11_class.ex06_memberboard.service;

import ch11_class.ex06_memberboard.common.CommonVariables;
import ch11_class.ex06_memberboard.dto.MemberDTO;
import ch11_class.ex06_memberboard.repository.MemberRepository;

import java.util.Scanner;
import java.util.List;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);

    public void save() {
        String memberEmail;
        MemberDTO memberDTO = null;
        do {
            System.out.print("이메일을 입력해주세요:");
            memberEmail = scanner.next();
            memberDTO = memberRepository.checkEmail(memberEmail); // 이메일 중복확인 메서드
            if (memberDTO == null) {
                System.out.println("사용 가능한 이메일입니다.");
            } else {
                System.out.println("이미 사용중인 이메일입니다.");
                System.out.println("다시 입력해주세요");
            }
        } while (memberDTO != null);
        System.out.print("비밀번호를 입력해주세요:");
        String memberPass = scanner.next();
        System.out.print("이름을 입력해주세요:");
        String memberName = scanner.next();
        System.out.print("전화번호를 입력해주세요:");
        String memberMobile = scanner.next();
        MemberDTO newMemberDTO = new MemberDTO(memberEmail, memberPass, memberName, memberMobile);
        boolean result = memberRepository.save(newMemberDTO);
        if (result) {
            System.out.println("회원가입이 완료되었습니다.");
        } else {
            System.out.println("알 수 없는 오류로 인하여 회원가입이 중지되었습니다.");
            System.out.println("다시 시도해주세요.");
        }
    }

    public void login() {
        System.out.print("이메일을 입력해주세요:");
        String memberEmail = scanner.next();
        System.out.print("비밀번호를 입력해주세요:");
        String memberPass = scanner.next();
        MemberDTO loginResult = memberRepository.login(memberEmail, memberPass);
        if (loginResult != null) {
            CommonVariables.loginEmail = memberEmail;
            System.out.println("로그인 성공");
            System.out.println(CommonVariables.loginEmail + "님 환영합니다!");
        } else {
            System.out.println("이메일이나 비밀번호를 잘못 입력하셨습니다.");
            System.out.println("다시 입력해주세요");
        }
    }

    public void memberList() {
        List<MemberDTO> memberDTOList = memberRepository.memberList();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

    public void memberUpdate() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("비밀번호를 입력해 주세요");
            String memberPass = scanner.next();
            MemberDTO passResult = memberRepository.checkPass(memberPass);
            if (passResult != null) {
                System.out.println("변경할 정보를 입력해주세요");
                System.out.print("이름");
                String memberName = scanner.next();
                System.out.print("전화번호");
                String memberMobile = scanner.next();
                boolean updateResult = memberRepository.memberUpdate(memberName, memberMobile);
                if (updateResult) {
                    System.out.println("정보 수정이 완료되었습니다.");
                } else {
                    System.out.println("알 수 없는 오류로 인하여 수정이 되지 않았습니다.");
                }
            }
            System.out.println("비밀번호가 일치하지 않습니다.");
        } else {
            System.out.println("로그인해야 이용할 수 있는 서비스 입니다.");
        }
    }

    public void memberDelete() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("이메일와 비밀번호를 입력해주세요");
            System.out.print("이메일: ");
            String memberEmail = scanner.next();
            System.out.print("비밀번호: ");
            String memberPass = scanner.next();
            MemberDTO check = memberRepository.login(memberEmail, memberPass);
            if (check != null) {
                boolean delete = memberRepository.memberDelete(memberEmail, memberPass);
                if (delete) {
                    System.out.println("회원 탈퇴가 완료되었습니다.");
                    System.out.println("지금까지 저희와 함께해주셔서 감사합니다.");
                } else {
                    System.out.println("탈퇴, 그러한 것은 존재하지 않습니다.");
                    System.out.println("저희와 영원히 함께해야 합니다.");
                }
            } else {
                System.out.println("로그인해야 이용할 수 있는 서비스입니다.");
                System.out.println("로그인 해주세요(근데 진짜 탈퇴할거는 아니지?)");
            }
        }
    }

    public void logout() {
        if (CommonVariables.loginEmail != null) {
            CommonVariables.loginEmail = null;
            System.out.println("로그아웃 되었습니다.");
        }else {
            System.out.println("로그인을 해야 로그아웃을 하지 ㅡㅅㅡ");
        }
    }
}
